package com.techtomato.SmsLibrary.domain;

public class Sms {
    private String to;
    private String message;
    private String from;

    public Sms(String to, String from,  String message) {
        this.to = to;
        this.message = message;
        this.from = from;
    }

    public Sms() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
