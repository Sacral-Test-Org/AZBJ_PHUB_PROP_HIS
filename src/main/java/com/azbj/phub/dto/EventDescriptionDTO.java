package com.azbj.phub.dto;

public class EventDescriptionDTO {
    private String eventNumber;
    private String proposalNumber;
    private String truncatedDate;
    private String description;

    public EventDescriptionDTO() {}

    public EventDescriptionDTO(String eventNumber, String proposalNumber, String truncatedDate, String description) {
        this.eventNumber = eventNumber;
        this.proposalNumber = proposalNumber;
        this.truncatedDate = truncatedDate;
        this.description = description;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getTruncatedDate() {
        return truncatedDate;
    }

    public void setTruncatedDate(String truncatedDate) {
        this.truncatedDate = truncatedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}