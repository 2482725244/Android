package com.example.perfectapp.bean;

public class MySet {
    private int icon;
    private int more;
    private String content;

    public MySet() {

    }

    public MySet(int icon, int more, String content) {
        this.icon = icon;
        this.more = more;
        this.content = content;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getMore() {
        return more;
    }

    public void setMore(int more) {
        this.more = more;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
