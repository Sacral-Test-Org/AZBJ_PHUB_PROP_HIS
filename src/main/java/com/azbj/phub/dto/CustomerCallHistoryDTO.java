package com.azbj.phub.dto;

import java.util.Date;

public class CustomerCallHistoryDTO {
    private Date call_date;
    private String caller_id;
    private String status;
    private String sub_status;
    private String proposal_medical_status;

    // Getters and Setters
    public Date getCall_date() {
        return call_date;
    }

    public void setCall_date(Date call_date) {
        this.call_date = call_date;
    }

    public String getCaller_id() {
        return caller_id;
    }

    public void setCaller_id(String caller_id) {
        this.caller_id = caller_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSub_status() {
        return sub_status;
    }

    public void setSub_status(String sub_status) {
        this.sub_status = sub_status;
    }

    public String getProposal_medical_status() {
        return proposal_medical_status;
    }

    public void setProposal_medical_status(String proposal_medical_status) {
        this.proposal_medical_status = proposal_medical_status;
    }
}