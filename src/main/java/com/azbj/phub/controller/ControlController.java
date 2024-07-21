package com.azbj.phub.controller;

import com.azbj.phub.dto.*;
import com.azbj.phub.service.ControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/control")
public class ControlController {

    @Autowired
    private ControlService controlService;

    @GetMapping("/application-data")
    public ResponseEntity<ControlDTO> getApplicationData(@RequestParam String applicationNo) {
        ControlDTO controlDTO = controlService.getApplicationData(applicationNo);
        return ResponseEntity.ok(controlDTO);
    }

    @GetMapping("/reason-comments")
    public ResponseEntity<List<ControlDTO>> getReasonComments(@RequestParam String applicationNumber) {
        List<ControlDTO> reasonComments = controlService.fetchReasonComments(applicationNumber);
        return ResponseEntity.ok(reasonComments);
    }

    @GetMapping("/pan-approval-details")
    public ResponseEntity<List<ControlDTO>> getPanApprovalDetails(@RequestParam String applicationNumber) {
        List<ControlDTO> approvalDetails = controlService.getPanApprovalDetails(applicationNumber);
        return ResponseEntity.ok(approvalDetails);
    }

    @GetMapping("/clear-form")
    public ResponseEntity<Void> clearForm() {
        controlService.clearFormService();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/requirement-details")
    public ResponseEntity<List<RequirementDetailsDTO>> getRequirementDetails(@RequestParam String proposalNumber) {
        List<RequirementDetailsDTO> requirementDetails = controlService.getRequirementDetails(proposalNumber);
        return ResponseEntity.ok(requirementDetails);
    }

    @GetMapping("/comments-remarks")
    public ResponseEntity<List<ControlDTO>> getCommentsAndRemarks(@RequestParam String applicationNumber, @RequestParam String policyNumber) {
        List<ControlDTO> commentsAndRemarks = controlService.fetchCommentsAndRemarks(applicationNumber, policyNumber);
        return ResponseEntity.ok(commentsAndRemarks);
    }

    @GetMapping("/scrutiny-status")
    public ResponseEntity<List<ScrutinyStatusDTO>> getScrutinyStatus(@RequestParam String applicationNo) {
        List<ScrutinyStatusDTO> scrutinyStatus = controlService.getScrutinyStatus(applicationNo);
        return ResponseEntity.ok(scrutinyStatus);
    }

    @GetMapping("/download-activity-tracker")
    public ResponseEntity<byte[]> downloadActivityTrackerData() {
        byte[] excelData = controlService.createExcelFile();
        return ResponseEntity.ok(excelData);
    }

    @GetMapping("/application-number")
    public ResponseEntity<String> getApplicationNumber(@RequestParam String biNumber) {
        String applicationNumber = controlService.getApplicationNumberByBiNumber(biNumber);
        return ResponseEntity.ok(applicationNumber);
    }

    @GetMapping("/proposal-medical-status")
    public ResponseEntity<List<ControlDTO>> fetchProposalMedicalStatus() {
        List<ControlDTO> proposalMedicalStatus = controlService.getProposalMedicalStatus();
        return ResponseEntity.ok(proposalMedicalStatus);
    }

    @GetMapping("/search-applications")
    public ResponseEntity<List<ApplicationDetailsDTO>> searchApplications(@RequestParam SearchCriteriaDTO searchCriteriaDTO) {
        List<ApplicationDetailsDTO> applicationDetails = controlService.searchApplications(searchCriteriaDTO);
        return ResponseEntity.ok(applicationDetails);
    }

    @GetMapping("/email-log-history")
    public ResponseEntity<List<EmailLogHistoryDTO>> getEmailLogHistory(@RequestParam String applicationNumber, @RequestParam String proposalNumber) {
        List<EmailLogHistoryDTO> emailLogHistory = controlService.fetchEmailLogHistory(applicationNumber, proposalNumber);
        return ResponseEntity.ok(emailLogHistory);
    }

    @GetMapping("/eia-details")
    public ResponseEntity<EiaDetailsDTO> getEiaDetails(@RequestParam String applicationNumber) {
        EiaDetailsDTO eiaDetails = controlService.fetchEiaDetails(applicationNumber);
        return ResponseEntity.ok(eiaDetails);
    }

    @GetMapping("/proposal-status")
    public ResponseEntity<String> getProposalStatus() {
        String proposalStatus = controlService.fetchProposalStatus();
        return ResponseEntity.ok(proposalStatus);
    }

    @GetMapping("/event-description")
    public ResponseEntity<EventDescription> getEventDescription() {
        EventDescription eventDescription = controlService.fetchEventDescription();
        return ResponseEntity.ok(eventDescription);
    }
}
