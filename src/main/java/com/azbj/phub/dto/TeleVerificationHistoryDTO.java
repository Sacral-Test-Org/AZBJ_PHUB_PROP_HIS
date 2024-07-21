package com.azbj.phub.dto;

public class TeleVerificationHistoryDTO {
    private String userId;
    private String dateTime;
    private String teleVerificationComments;
    private String teleVerificationStatus;
    private String userComments;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTeleVerificationComments() {
        return teleVerificationComments;
    }

    public void setTeleVerificationComments(String teleVerificationComments) {
        this.teleVerificationComments = teleVerificationComments;
    }

    public String getTeleVerificationStatus() {
        return teleVerificationStatus;
    }

    public void setTeleVerificationStatus(String teleVerificationStatus) {
        this.teleVerificationStatus = teleVerificationStatus;
    }

    public String getUserComments() {
        return userComments;
    }

    public void setUserComments(String userComments) {
        this.userComments = userComments;
    }
}