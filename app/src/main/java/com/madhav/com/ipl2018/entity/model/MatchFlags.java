package com.madhav.com.ipl2018.entity.model;


import com.madhav.com.ipl2018.entity.Matches;

/**
 * Created by madhav on 4/9/2018.
 */

public class MatchFlags {
    Matches.ScheduleBean scheduleBeans;
    boolean isCurrentDate;

    public MatchFlags(Matches.ScheduleBean scheduleBeans, boolean isCurrentDate) {
        this.scheduleBeans = scheduleBeans;
        this.isCurrentDate = isCurrentDate;
    }

    public MatchFlags() {
    }

    public Matches.ScheduleBean getScheduleBeans() {
        return scheduleBeans;
    }

    public void setScheduleBeans(Matches.ScheduleBean scheduleBeans) {
        this.scheduleBeans = scheduleBeans;
    }

    public boolean isCurrentDate() {
        return isCurrentDate;
    }

    public void setCurrentDate(boolean currentDate) {
        isCurrentDate = currentDate;
    }
}
