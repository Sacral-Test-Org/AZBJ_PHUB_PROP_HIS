package com.azbj.phub.dto;

import java.util.Date;

public class ActivityTrackerDTO {
    private String activity;
    private String activityUser;
    private Date activityDate;

    public ActivityTrackerDTO() {}

    public ActivityTrackerDTO(String activity, String activityUser, Date activityDate) {
        this.activity = activity;
        this.activityUser = activityUser;
        this.activityDate = activityDate;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivityUser() {
        return activityUser;
    }

    public void setActivityUser(String activityUser) {
        this.activityUser = activityUser;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }
}
