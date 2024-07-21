package com.azbj.phub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "email_log_history")
public class EmailLogHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailStatus;
    private Date dateTimeSent;
    private String registeredEmailId;
    private String letterType;
    private int successfulMails;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
