package com.azbj.phub.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "tele_verification_history")
public class TeleVerificationHistory {

    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "date_time", nullable = false)
    private String dateTime;

    @Column(name = "tele_verification_comments", length = 700)
    private String teleVerificationComments;

    @Column(name = "tele_verification_status", length = 100)
    private String teleVerificationStatus;

    @Column(name = "user_comments", length = 300)
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
