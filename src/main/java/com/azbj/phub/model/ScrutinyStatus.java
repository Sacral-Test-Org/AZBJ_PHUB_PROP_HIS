package com.azbj.phub.model;

import java.util.Date;

public class ScrutinyStatus {
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
