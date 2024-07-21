package com.azbj.phub.dto;

import java.util.Date;

public class RequirementDetailsDTO {
    private String reqType;
    private String sysDesc;
    private Date reqRaisedDate;
    private String recdstat;

    // Getters and Setters
    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }

    public Date getReqRaisedDate() {
        return reqRaisedDate;
    }

    public void setReqRaisedDate(Date reqRaisedDate) {
        this.reqRaisedDate = reqRaisedDate;
    }

    public String getRecdstat() {
        return recdstat;
    }

    public void setRecdstat(String recdstat) {
        this.recdstat = recdstat;
    }
}
