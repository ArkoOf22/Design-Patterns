package com.example.designpatterns.Observer.Observe;

import com.example.designpatterns.Observer.Observable.Observable;

public class SMSNotification implements Notification {
    long number;
    Observable observable;
    public SMSNotification(long number,Observable observable){
        this.number=number;
        this.observable=observable;
    }
    @Override
    public void update() {
        pushSms(number, " Product is back in stock");
    }
    public void pushSms(long number, String msg){
        System.out.println("Dear "+ number+" "+msg);
    }

}
