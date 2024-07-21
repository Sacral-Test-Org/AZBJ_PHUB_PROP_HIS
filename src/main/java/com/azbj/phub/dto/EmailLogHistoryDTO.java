package com.azbj.phub.dto;

import java.util.Date;

public class EmailLogHistoryDTO {
    private String emailStatus;
    private Date dateTimeSent;
    private String registeredEmailId;
    private String letterType;
    private int successfulMails;

    // Getters and Setters
    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Date getDateTimeSent() {
        return dateTimeSent;
    }

    public void setDateTimeSent(Date dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }

    public String getRegisteredEmailId() {
        return registeredEmailId;
    }

    public void setRegisteredEmailId(String registeredEmailId) {
        this.registeredEmailId = registeredEmailId;
    }

    public String getLetterType() {
        return letterType;
    }

    public void setLetterType(String letterType) {
        this.letterType = letterType;
    }

    public int getSuccessfulMails() {
        return successfulMails;
    }

    public void setSuccessfulMails(int successfulMails) {
        this.successfulMails = successfulMails;
    }
}