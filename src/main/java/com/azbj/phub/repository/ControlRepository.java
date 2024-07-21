package com.azbj.phub.repository;

import com.azbj.phub.model.Control;
import com.azbj.phub.dto.ControlDTO;
import com.azbj.phub.dto.RequirementDetailsDTO;
import com.azbj.phub.dto.SearchCriteriaDTO;
import com.azbj.phub.dto.ApplicationDetailsDTO;
import com.azbj.phub.model.EmailLogHistory;
import com.azbj.phub.model.EiaDetails;
import com.azbj.phub.model.ScrutinyStatus;
import com.azbj.phub.model.EventDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ControlRepository extends JpaRepository<Control, Long> {

    @Query("SELECT c FROM Control c WHERE c.applicationNo = :applicationNo")
    Control findByApplicationNo(@Param("applicationNo") String applicationNo);

    @Query("SELECT c FROM Control c WHERE c.applicationNumber = :applicationNumber ORDER BY c.commentDate")
    List<Control> findReasonCommentsByApplicationNumber(@Param("applicationNumber") String applicationNumber);

    @Query("SELECT new com.azbj.phub.dto.ControlDTO(c.approvedUser, az_pk2_general.getusername(c.approvedUser), TRUNC(c.createDate), TO_CHAR(c.createDate, 'hh:mi:ss am'), CASE WHEN c.panStdFlag = 'Y' THEN 'Standard' WHEN c.panStdFlag = 'N' THEN 'Non-Standard' WHEN c.panStdFlag = 'R' THEN 'Review' END) FROM Control c WHERE c.ageProof = 'PC' AND NVL(c.panStdFlag, 'NA') <> 'NA' AND c.applicationNo = :applicationNo ORDER BY c.createDate DESC")
    List<ControlDTO> findPanApprovalDetails(@Param("applicationNo") String applicationNo);

    @Query("SELECT new com.azbj.phub.dto.RequirementDetailsDTO(a.testno, UPPER(TRIM(b.sysDesc)), a.calledDate, a.recdstat) FROM WipAzbjMedUw a JOIN AzbjSystemConstants b ON b.sysCode = a.testno WHERE b.sysType IN ('FR_REQ', 'MED_TEST') AND a.contractId = azbj_pk0_acc.get_contract_id(:proposalNumber) ORDER BY NVL(a.recdstat, 'N') ASC")
    List<RequirementDetailsDTO> findRequirementDetailsFromWip(@Param("proposalNumber") String proposalNumber);

    @Query("SELECT new com.azbj.phub.dto.RequirementDetailsDTO(a.testno, UPPER(TRIM(b.sysDesc)), a.calledDate, a.recdstat) FROM AzbjMedUw a JOIN AzbjSystemConstants b ON b.sysCode = a.testno WHERE b.sysType IN ('FR_REQ', 'MED_TEST') AND a.contractId = azbj_pk0_acc.get_contract_id(:proposalNumber) ORDER BY NVL(a.recdstat, 'N') ASC")
    List<RequirementDetailsDTO> findRequirementDetailsFromAzbj(@Param("proposalNumber") String proposalNumber);

    @Query("SELECT c FROM Control c WHERE c.policyNo = :policyNumber AND c.flag = 'N'")
    List<Control> findCommentsByPolicyNumber(@Param("policyNumber") String policyNumber);

    @Query("SELECT c FROM Control c WHERE c.applicationNo = :applicationNumber AND c.answer <> c.stpAnswer")
    List<Control> findRemarksByApplicationNumber(@Param("applicationNumber") String applicationNumber);

    @Query("SELECT s FROM ScrutinyStatus s WHERE s.applicationNo = :applicationNo")
    List<ScrutinyStatus> findScrutinyStatusByApplicationNo(@Param("applicationNo") String applicationNo);

    @Query("SELECT c.applicationNo FROM Control c WHERE c.biNumber = :biNumber")
    String findApplicationNumberByBiNumber(@Param("biNumber") String biNumber);

    @Query("SELECT c FROM Control c WHERE c.propNo = :proposalNumber AND c.subStatus NOT IN ('AD', 'AC', 'DA', 'MED') ORDER BY c.dateOfFollow, c.followTime")
    List<Control> findProposalMedicalStatus(@Param("proposalNumber") String proposalNumber);

    @Query("SELECT new com.azbj.phub.dto.ApplicationDetailsDTO(c.applicationNo, c.currentStatus, c.flags, c.policyDispatchStatus, c.competitionDetails, c.agentDetails, c.comments) FROM Control c WHERE c.searchCriteria = :searchCriteriaDTO")
    List<ApplicationDetailsDTO> findApplications(@Param("searchCriteriaDTO") SearchCriteriaDTO searchCriteriaDTO);

    @Query("SELECT azbj_pk0_acc.get_contract_id(:proposalNumber) FROM dual")
    String findContractIdByProposalNumber(@Param("proposalNumber") String proposalNumber);

    @Query("SELECT customer.azbj_get_email_id(:contractId) FROM dual")
    String findEmailIdByContractId(@Param("contractId") String contractId);

    @Query("SELECT new com.azbj.phub.dto.EmailLogHistoryDTO(DECODE(tableData, '1', 'Policy Bond', '2', 'EIA Letter'), mailFlag, updatedOn) FROM (SELECT 1 tableData, DECODE(mailYn, 'Y', 'Sent Success', 'N', 'Sent Failure') mailFlag, updatedOn FROM AzbjPolicyCopyMailer WHERE policyRef = :contractId UNION SELECT 2 tableData, DECODE(sendFlag, 'Y', 'Sent Success', 'N', 'Sent Failure') mailFlag, mailSendTime updatedOn FROM AzbjEiaLetterGenDtls WHERE policyNo = :contractId) ORDER BY updatedOn DESC")
    List<EmailLogHistoryDTO> findEmailLogHistory(@Param("contractId") String contractId);

    @Query("SELECT new com.azbj.phub.model.EiaDetails('Y', e.eiaAccountType, e.createUser, e.createDate) FROM AzbjEiaDetails e WHERE e.applicationNo = :applicationNumber AND e.scrutinyNo IS NOT NULL AND UPPER(e.flag) = 'SCRU'")
    List<EiaDetails> findEiaDetailsByApplicationNumber(@Param("applicationNumber") String applicationNumber);

    @Query("SELECT c.proposalStatus FROM Control c")
    String findProposalStatus();

    @Query("SELECT e FROM EventDescription e")
    EventDescription findEventDescription();
}
