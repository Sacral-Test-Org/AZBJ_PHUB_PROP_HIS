package com.azbj.phub.dto;

import java.util.Date;

public class ScrutinyStatusDTO {
    private String deletionComment;
    private String userId;
    private Date commentDate;

    // Getters and Setters
    public String getDeletionComment() {
        return deletionComment;
    }

    public void setDeletionComment(String deletionComment) {
        this.deletionComment = deletionComment;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}