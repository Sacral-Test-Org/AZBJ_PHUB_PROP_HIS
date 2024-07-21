package com.azbj.phub.dto;

public class ApplicationDetailsDTO {
    private String applicationNumber;
    private String currentStatus;
    private String flags;
    private String policyDispatchStatus;
    private String competitionDetails;
    private String comments;

    // Getters and Setters
    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getPolicyDispatchStatus() {
        return policyDispatchStatus;
    }

    public void setPolicyDispatchStatus(String policyDispatchStatus) {
        this.policyDispatchStatus = policyDispatchStatus;
    }

    public String getCompetitionDetails() {
        return competitionDetails;
    }

    public void setCompetitionDetails(String competitionDetails) {
        this.competitionDetails = competitionDetails;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}