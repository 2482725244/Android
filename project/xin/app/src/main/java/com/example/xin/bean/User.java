package com.example.xin.bean;

public class User {
    private int src;
    private String title;
    private String content;

    public User() {

    }

    public User(int src, String title, String content) {
        this.src = src;
        this.title = title;
        this.content = content;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
