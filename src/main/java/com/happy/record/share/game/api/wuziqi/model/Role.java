package com.happy.record.share.game.api.wuziqi.model;

public class Role {
    private String name;
    private Integer id;
    private String Phone;

    public Role(Integer id,String name,String Phone){
        this.id = id;
        this.name = name;
        this.Phone = Phone;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
