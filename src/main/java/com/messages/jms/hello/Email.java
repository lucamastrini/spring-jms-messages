package com.messages.jms.hello;

/**
 * Created by @luca on 22/10/16.
 * Immagination is more important then knowledge. @AI
 */


public class Email {

    private String to;
    private String message;

    //requested by jms template
    public Email() {

    }

    public Email(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
