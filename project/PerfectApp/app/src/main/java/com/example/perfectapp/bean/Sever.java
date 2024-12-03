package com.example.perfectapp.bean;

public class Sever {
    private int imgSrc;
    private String name;

    public Sever(int imgSrc, String name) {
        this.imgSrc = imgSrc;
        this.name = name;
    }

    public Sever() {
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
