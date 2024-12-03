package com.example.perfectapp.bean;

import java.io.Serializable;

public class NewPager extends NewPagerParent implements Serializable {
    private int imgSrc;
    private String title;

    private String contentText;

    public NewPager() {

    }

    public NewPager(int imgSrc, String title, String contentText) {
        this.imgSrc = imgSrc;
        this.title = title;
        this.contentText = contentText;
    }

    @Override
    public int getImgSrc() {
        return imgSrc;
    }

    @Override
    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getContentText() {
        return contentText;
    }

    @Override
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }
}
