package com.happy.record.share.game.api.wuziqi.model;

public class ResponseModel {
    private String status;
    private Object Data;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
