package com.example.testdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RoomBean implements Serializable {
    private String name;
    private int id;
    private List<SonBean> list = new ArrayList<>();

    public RoomBean(String name,int id){
        this.id = id;
        this.name = name;
        list.add(new SonBean("dage",18));
        list.add(new SonBean("er",12));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<SonBean> getList() {
        return list;
    }

    public void setList(List<SonBean> list) {
        this.list = list;
    }
}
