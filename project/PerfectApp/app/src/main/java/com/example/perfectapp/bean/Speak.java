package com.example.perfectapp.bean;

public class Speak {
    private int imgSrc;
    private String content;

    public Speak(int imgSrc, String content) {
        this.imgSrc = imgSrc;
        this.content = content;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
