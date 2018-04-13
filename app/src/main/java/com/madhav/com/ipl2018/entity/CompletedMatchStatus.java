package com.madhav.com.ipl2018.entity;

/**
 * Created by madhav on 4/12/2018.
 */

public class CompletedMatchStatus {
    private String matchId;
    private String status;

    public CompletedMatchStatus(String matchId, String status) {
        this.matchId = matchId;
        this.status = status;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
