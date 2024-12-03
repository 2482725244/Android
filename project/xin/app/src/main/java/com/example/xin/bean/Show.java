package com.example.xin.bean;

public class Show {
    private int src;
    private String content;

    public Show() {

    }

    public Show(int src, String content) {
        this.src = src;
        this.content = content;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
