package com.azbj.phub.dto;

public class SearchCriteriaDTO {
    private String applicationNumber;
    private String receiptNumber;
    private String proposalNumber;
    private String scrutinyNumber;
    private String biNumber;

    // Getters and Setters
    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getScrutinyNumber() {
        return scrutinyNumber;
    }

    public void setScrutinyNumber(String scrutinyNumber) {
        this.scrutinyNumber = scrutinyNumber;
    }

    public String getBiNumber() {
        return biNumber;
    }

    public void setBiNumber(String biNumber) {
        this.biNumber = biNumber;
    }
}