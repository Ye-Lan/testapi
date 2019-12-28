package com.yelan.testapi.vo;

import java.util.Date;

public class Person {
    private String id;
    private String name;
    private Date birthday;
    private Byte[] picData;
    private String thumbnail;

    public Person(String id, String name, String thumbnail) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte[] getPicData() {
        return picData;
    }

    public void setPicData(Byte[] picData) {
        this.picData = picData;
    }


}
