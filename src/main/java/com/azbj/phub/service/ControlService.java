package com.azbj.phub.service;

import com.azbj.phub.repository.ControlRepository;
import com.azbj.phub.dto.ControlDTO;
import com.azbj.phub.dto.RequirementDetailsDTO;
import com.azbj.phub.dto.ScrutinyStatusDTO;
import com.azbj.phub.dto.EmailLogHistoryDTO;
import com.azbj.phub.dto.EiaDetailsDTO;
import com.azbj.phub.dto.SearchCriteriaDTO;
import com.azbj.phub.dto.ApplicationDetailsDTO;
import com.azbj.phub.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ControlService {

    @Autowired
    private ControlRepository controlRepository;

    public ControlDTO getApplicationData(String applicationNo) {
        Control control = controlRepository.findByApplicationNo(applicationNo);
        return new ControlDTO(control);
    }

    public List<ControlDTO> fetchReasonComments(String applicationNumber) {
        List<Control> comments = controlRepository.findReasonCommentsByApplicationNumber(applicationNumber);
        return comments.stream().map(ControlDTO::new).collect(Collectors.toList());
    }

    public List<ControlDTO> getPanApprovalDetails(String applicationNumber) {
        return controlRepository.findPanApprovalDetails(applicationNumber);
    }

    public void clearFormService() {
        // Implement business logic to clear the form.
    }

    public List<RequirementDetailsDTO> getRequirementDetails(String proposalNumber) {
        List<RequirementDetailsDTO> wipDetails = controlRepository.findRequirementDetailsFromWip(proposalNumber);
        List<RequirementDetailsDTO> azbjDetails = controlRepository.findRequirementDetailsFromAzbj(proposalNumber);
        List<RequirementDetailsDTO> combinedDetails = wipDetails;
        combinedDetails.addAll(azbjDetails);
        combinedDetails.sort((d1, d2) -> d1.getRecdstat().compareTo(d2.getRecdstat()));
        return combinedDetails;
    }

    public List<ControlDTO> fetchCommentsAndRemarks(String applicationNumber, String policyNumber) {
        List<Control> comments = controlRepository.findCommentsByPolicyNumber(policyNumber);
        List<Control> remarks = controlRepository.findRemarksByApplicationNumber(applicationNumber);
        List<Control> combined = comments;
        combined.addAll(remarks);
        return combined.stream().map(ControlDTO::new).collect(Collectors.toList());
    }

    public List<ScrutinyStatusDTO> getScrutinyStatus(String applicationNo) {
        List<ScrutinyStatus> statuses = controlRepository.findScrutinyStatusByApplicationNo(applicationNo);
        return statuses.stream().map(ScrutinyStatusDTO::new).collect(Collectors.toList());
    }

    public byte[] createExcelFile() {
        List<ActivityTrackerDTO> activityData = controlRepository.findAllActivityData();
        return ExcelUtil.createExcelFile(activityData);
    }

    public String getApplicationNumberByBiNumber(String biNumber) {
        if (biNumber == null || biNumber.isEmpty()) {
            return null;
        }
        return controlRepository.findApplicationNumberByBiNumber(biNumber);
    }

    public List<ControlDTO> getProposalMedicalStatus() {
        List<Control> records = controlRepository.findProposalMedicalStatus();
        return records.stream().map(ControlDTO::new).collect(Collectors.toList());
    }

    public List<ApplicationDetailsDTO> searchApplications(SearchCriteriaDTO searchCriteriaDTO) {
        return controlRepository.findApplications(searchCriteriaDTO);
    }

    public List<EmailLogHistoryDTO> fetchEmailLogHistory(String applicationNumber, String proposalNumber) {
        String contractId = controlRepository.findContractIdByProposalNumber(proposalNumber);
        String emailId = controlRepository.findEmailIdByContractId(contractId);
        List<EmailLogHistoryDTO> emailLogs = controlRepository.findEmailLogHistory(contractId);
        long successCount = emailLogs.stream().filter(log -> "Sent Success".equals(log.getMailFlag())).count();
        return emailLogs;
    }

    public EiaDetailsDTO fetchEiaDetails(String applicationNumber) {
        List<EiaDetails> eiaDetails = controlRepository.findEiaDetailsByApplicationNumber(applicationNumber);
        return new EiaDetailsDTO(eiaDetails);
    }

    public String fetchProposalStatus() {
        return controlRepository.findProposalStatus();
    }

    public EventDescription fetchEventDescription() {
        return controlRepository.findEventDescription();
    }
}
