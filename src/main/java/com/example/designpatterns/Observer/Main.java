package com.example.designpatterns.Observer;

import com.example.designpatterns.Observer.Observable.Observable;
import com.example.designpatterns.Observer.Observable.OutOfStockProduct;
import com.example.designpatterns.Observer.Observe.Notification;
import com.example.designpatterns.Observer.Observe.SMSNotification;

public class Main {
    public static void main(String[] args) {
        Observable phone=new OutOfStockProduct();

        Notification observer1=new SMSNotification(912134567, phone);
        Notification observer2=new SMSNotification(912134568, phone);
        Notification observer3=new SMSNotification(912134569, phone);

        phone.add(observer1);
        phone.add(observer2);
        phone.add(observer3);

        phone.set(100);
    }
}
