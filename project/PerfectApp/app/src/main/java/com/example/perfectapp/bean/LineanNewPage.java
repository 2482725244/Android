package com.example.perfectapp.bean;

import java.io.Serializable;

public class LineanNewPage extends NewPagerParent implements Serializable {
    private int imgSrc;
    private String title;
    private int personNumber;
    private int zanNumber;

    private String contentText;

    public LineanNewPage(int imgSrc, String title, int personNumber, int zanNumber, String contentText) {
        this.imgSrc = imgSrc;
        this.title = title;
        this.personNumber = personNumber;
        this.zanNumber = zanNumber;
        this.contentText = contentText;
    }



    public LineanNewPage() {
    }


    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public int getZanNumber() {
        return zanNumber;
    }

    public void setZanNumber(int zanNumber) {
        this.zanNumber = zanNumber;
    }
}
