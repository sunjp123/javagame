package com.happy.record.share.game.api.wuziqi.model;

import java.util.Date;

public class WuziqiInfoDTO {
    private  Role role1;
    private  Role role2;
    private Date startTime;
    private Boolean status;

    public Role getRole1() {
        return role1;
    }

    public void setRole1(Role role1) {
        this.role1 = role1;
    }

    public Role getRole2() {
        return role2;
    }

    public void setRole2(Role role2) {
        this.role2 = role2;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
