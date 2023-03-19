package com.techtomato.SmsLibrary.domain;

public class Sms {
    private String to;
    private String messge;

    public Sms(String to, String messge) {
        this.to = to;
        this.messge = messge;
    }

    public Sms() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }
}
