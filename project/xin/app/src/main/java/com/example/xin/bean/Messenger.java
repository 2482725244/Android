package com.example.xin.bean;

public class Messenger {
    private String messenger;
    private int judgmentNumber;

    public Messenger(String messenger) {
        this.messenger = messenger;
    }

    public Messenger(String messenger, int judgmentNumber) {
        this.messenger = messenger;
        this.judgmentNumber = judgmentNumber;
    }

    public Messenger() {
    }





    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    public int getJudgmentNumber() {
        return judgmentNumber;
    }

    public void setJudgmentNumber(int judgmentNumber) {
        this.judgmentNumber = judgmentNumber;
    }
}
