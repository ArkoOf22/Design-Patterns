package com.example.designpatterns.Observer.Observable;

import com.example.designpatterns.Observer.Observe.Notification;

import java.util.ArrayList;
import java.util.List;

public class OutOfStockProduct implements Observable{

    List<Notification> list=new ArrayList<>();
    int initialCount;
    @Override
    public void add(Notification notification) {
        list.add(notification);
    }

    @Override
    public void remove(Notification notification) {
        list.remove(notification);
    }

    @Override
    public void notifyObservers() {
        for(Notification notification:list){
            notification.update();
        }
    }

    @Override
    public void set(int count) {
        if(initialCount==0){
            notifyObservers();
        }
        initialCount+=count;
    }

    @Override
    public int get() {
        return initialCount;
    }
}
