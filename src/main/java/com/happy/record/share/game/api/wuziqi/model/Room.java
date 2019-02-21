package com.happy.record.share.game.api.wuziqi.model;

import java.sql.Timestamp;
import java.util.Date;

public class Room {
    private Integer roomid;
    private Role player1;
    private Role player2;
    private Date createTime;
    private Date startTime;
    private Role winner;
    public Room(Role player1,Role player2,Date createTime){
        this.player1 = player1;
        this.player2 = player2;
        this.createTime = createTime;
    }
    public Room(Integer roomid, Integer pid1, Integer pid2, Timestamp date,Integer winner){
        this.roomid = roomid;
        this.player1 = new Role(pid1,"","");
        this.player2 = new Role(pid2,"","");
        this.createTime = date;
    }
    public Role getPlayer1() {
        return player1;
    }

    public void setPlayer1(Role player1) {
        this.player1 = player1;
    }

    public Role getPlayer2() {
        return player2;
    }

    public void setPlayer2(Role player2) {
        this.player2 = player2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Role getWinner() {
        return winner;
    }

    public void setWinner(Role winner) {
        this.winner = winner;
    }
}
