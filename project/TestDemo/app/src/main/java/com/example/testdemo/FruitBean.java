package com.example.testdemo;

import android.widget.ImageView;
import android.widget.TextView;

public class FruitBean {
    private Integer src;
    private String string;

    public FruitBean(Integer src, String string) {
        this.src = src;
        this.string = string;
    }

    public FruitBean() {
    }

    public Integer getSrc() {
        return src;
    }

    public void setSrc(Integer src) {
        this.src = src;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
