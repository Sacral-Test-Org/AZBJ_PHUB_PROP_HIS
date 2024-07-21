package com.azbj.phub.dto;

import java.util.Date;
import java.sql.Time;

public class ControlDTO {
    // Control Block Fields
    private String applicationNo;
    private String physicalPolicyBond;
    private String userId;

    // Reason Comments Fields
    private String reason;
    private String comments;
    private Date commentDate;

    // Approval Details Fields
    private String approvedUser;
    private String userName;
    private Date apprvDate;
    private String apprvTime;
    private String status;

    // Comments and Remarks Fields
    private String remarks;

    // Scrutiny Status Fields
    private String deletionComment;
    private Date scrutinyCommentDate;

    // Proposal Medical Status Fields
    private String propNo;
    private String subStatus;
    private Date dateOfFollow;
    private Time followTime;
    private Date sysdt;
    private String callerId;
    private String medicalStatus;

    // Search Results Fields
    private String applicationNumber;
    private String receiptNumber;
    private String proposalNumber;
    private String scrutinyNumber;
    private String biNumber;
    private String currentStatus;
    private String flags;
    private String policyDispatchStatus;
    private String competitionDetails;

    // EIA Details Fields
    private String eiaStatusScr;
    private String eiaAccountTypeScr;
    private String createUserScr;
    private Date createDateScr;
    private String eiaStatusDeqc;
    private String eiaAccountTypeDeqc;
    private String createUserDeqc;
    private Date createDateDeqc;
    private String eiaStatusBbu;
    private String eiaAccountTypeBbu;
    private String createUserBbu;
    private Date createDateBbu;
    private String eiaStatusAccCreation;
    private String createUserAccCreation;
    private Time createTimeAccCreation;
    private String eiaStatusAccUpload;
    private String statusAccUpload;
    private String createUserAccUpload;
    private Date createDateAccUpload;
    private String eiaStatusXml;
    private String createUserXml;
    private Time createTimeXml;
    private String eiaStatusXmlUpload;
    private String statusXmlUpload;
    private String createUserXmlUpload;
    private Date createDateXmlUpload;
    private String eiaStatusLogistics;
    private String createUserLogistics;
    private Date createDateLogistics;

    // Event Description Fields
    private String proposalStatus;
    private EventDescription eventDescription;

    // Getters and Setters
    public String getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }

    public String getPhysicalPolicyBond() {
        return physicalPolicyBond;
    }

    public void setPhysicalPolicyBond(String physicalPolicyBond) {
        this.physicalPolicyBond = physicalPolicyBond;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getApprovedUser() {
        return approvedUser;
    }

    public void setApprovedUser(String approvedUser) {
        this.approvedUser = approvedUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getApprvDate() {
        return apprvDate;
    }

    public void setApprvDate(Date apprvDate) {
        this.apprvDate = apprvDate;
    }

    public String getApprvTime() {
        return apprvTime;
    }

    public void setApprvTime(String apprvTime) {
        this.apprvTime = apprvTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDeletionComment() {
        return deletionComment;
    }

    public void setDeletionComment(String deletionComment) {
        this.deletionComment = deletionComment;
    }

    public Date getScrutinyCommentDate() {
        return scrutinyCommentDate;
    }

    public void setScrutinyCommentDate(Date scrutinyCommentDate) {
        this.scrutinyCommentDate = scrutinyCommentDate;
    }

    public String getPropNo() {
        return propNo;
    }

    public void setPropNo(String propNo) {
        this.propNo = propNo;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public Date getDateOfFollow() {
        return dateOfFollow;
    }

    public void setDateOfFollow(Date dateOfFollow) {
        this.dateOfFollow = dateOfFollow;
    }

    public Time getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Time followTime) {
        this.followTime = followTime;
    }

    public Date getSysdt() {
        return sysdt;
    }

    public void setSysdt(Date sysdt) {
        this.sysdt = sysdt;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }

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

    public String getEiaStatusScr() {
        return eiaStatusScr;
    }

    public void setEiaStatusScr(String eiaStatusScr) {
        this.eiaStatusScr = eiaStatusScr;
    }

    public String getEiaAccountTypeScr() {
        return eiaAccountTypeScr;
    }

    public void setEiaAccountTypeScr(String eiaAccountTypeScr) {
        this.eiaAccountTypeScr = eiaAccountTypeScr;
    }

    public String getCreateUserScr() {
        return createUserScr;
    }

    public void setCreateUserScr(String createUserScr) {
        this.createUserScr = createUserScr;
    }

    public Date getCreateDateScr() {
        return createDateScr;
    }

    public void setCreateDateScr(Date createDateScr) {
        this.createDateScr = createDateScr;
    }

    public String getEiaStatusDeqc() {
        return eiaStatusDeqc;
    }

    public void setEiaStatusDeqc(String eiaStatusDeqc) {
        this.eiaStatusDeqc = eiaStatusDeqc;
    }

    public String getEiaAccountTypeDeqc() {
        return eiaAccountTypeDeqc;
    }

    public void setEiaAccountTypeDeqc(String eiaAccountTypeDeqc) {
        this.eiaAccountTypeDeqc = eiaAccountTypeDeqc;
    }

    public String getCreateUserDeqc() {
        return createUserDeqc;
    }

    public void setCreateUserDeqc(String createUserDeqc) {
        this.createUserDeqc = createUserDeqc;
    }

    public Date getCreateDateDeqc() {
        return createDateDeqc;
    }

    public void setCreateDateDeqc(Date createDateDeqc) {
        this.createDateDeqc = createDateDeqc;
    }

    public String getEiaStatusBbu() {
        return eiaStatusBbu;
    }

    public void setEiaStatusBbu(String eiaStatusBbu) {
        this.eiaStatusBbu = eiaStatusBbu;
    }

    public String getEiaAccountTypeBbu() {
        return eiaAccountTypeBbu;
    }

    public void setEiaAccountTypeBbu(String eiaAccountTypeBbu) {
        this.eiaAccountTypeBbu = eiaAccountTypeBbu;
    }

    public String getCreateUserBbu() {
        return createUserBbu;
    }

    public void setCreateUserBbu(String createUserBbu) {
        this.createUserBbu = createUserBbu;
    }

    public Date getCreateDateBbu() {
        return createDateBbu;
    }

    public void setCreateDateBbu(Date createDateBbu) {
        this.createDateBbu = createDateBbu;
    }

    public String getEiaStatusAccCreation() {
        return eiaStatusAccCreation;
    }

    public void setEiaStatusAccCreation(String eiaStatusAccCreation) {
        this.eiaStatusAccCreation = eiaStatusAccCreation;
    }

    public String getCreateUserAccCreation() {
        return createUserAccCreation;
    }

    public void setCreateUserAccCreation(String createUserAccCreation) {
        this.createUserAccCreation = createUserAccCreation;
    }

    public Time getCreateTimeAccCreation() {
        return createTimeAccCreation;
    }

    public void setCreateTimeAccCreation(Time createTimeAccCreation) {
        this.createTimeAccCreation = createTimeAccCreation;
    }

    public String getEiaStatusAccUpload() {
        return eiaStatusAccUpload;
    }

    public void setEiaStatusAccUpload(String eiaStatusAccUpload) {
        this.eiaStatusAccUpload = eiaStatusAccUpload;
    }

    public String getStatusAccUpload() {
        return statusAccUpload;
    }

    public void setStatusAccUpload(String statusAccUpload) {
        this.statusAccUpload = statusAccUpload;
    }

    public String getCreateUserAccUpload() {
        return createUserAccUpload;
    }

    public void setCreateUserAccUpload(String createUserAccUpload) {
        this.createUserAccUpload = createUserAccUpload;
    }

    public Date getCreateDateAccUpload() {
        return createDateAccUpload;
    }

    public void setCreateDateAccUpload(Date createDateAccUpload) {
        this.createDateAccUpload = createDateAccUpload;
    }

    public String getEiaStatusXml() {
        return eiaStatusXml;
    }

    public void setEiaStatusXml(String eiaStatusXml) {
        this.eiaStatusXml = eiaStatusXml;
    }

    public String getCreateUserXml() {
        return createUserXml;
    }

    public void setCreateUserXml(String createUserXml) {
        this.createUserXml = createUserXml;
    }

    public Time getCreateTimeXml() {
        return createTimeXml;
    }

    public void setCreateTimeXml(Time createTimeXml) {
        this.createTimeXml = createTimeXml;
    }

    public String getEiaStatusXmlUpload() {
        return eiaStatusXmlUpload;
    }

    public void setEiaStatusXmlUpload(String eiaStatusXmlUpload) {
        this.eiaStatusXmlUpload = eiaStatusXmlUpload;
    }

    public String getStatusXmlUpload() {
        return statusXmlUpload;
    }

    public void setStatusXmlUpload(String statusXmlUpload) {
        this.statusXmlUpload = statusXmlUpload;
    }

    public String getCreateUserXmlUpload() {
        return createUserXmlUpload;
    }

    public void setCreateUserXmlUpload(String createUserXmlUpload) {
        this.createUserXmlUpload = createUserXmlUpload;
    }

    public Date getCreateDateXmlUpload() {
        return createDateXmlUpload;
    }

    public void setCreateDateXmlUpload(Date createDateXmlUpload) {
        this.createDateXmlUpload = createDateXmlUpload;
    }

    public String getEiaStatusLogistics() {
        return eiaStatusLogistics;
    }

    public void setEiaStatusLogistics(String eiaStatusLogistics) {
        this.eiaStatusLogistics = eiaStatusLogistics;
    }

    public String getCreateUserLogistics() {
        return createUserLogistics;
    }

    public void setCreateUserLogistics(String createUserLogistics) {
        this.createUserLogistics = createUserLogistics;
    }

    public Date getCreateDateLogistics() {
        return createDateLogistics;
    }

    public void setCreateDateLogistics(Date createDateLogistics) {
        this.createDateLogistics = createDateLogistics;
    }

    public String getProposalStatus() {
        return proposalStatus;
    }

    public void setProposalStatus(String proposalStatus) {
        this.proposalStatus = proposalStatus;
    }

    public EventDescription getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(EventDescription eventDescription) {
        this.eventDescription = eventDescription;
    }
}

class EventDescription {
    private String eventNumber;
    private String proposalNumber;
    private Date truncatedDate;

    // Getters and Setters
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

    public Date getTruncatedDate() {
        return truncatedDate;
    }

    public void setTruncatedDate(Date truncatedDate) {
        this.truncatedDate = truncatedDate;
    }
}
