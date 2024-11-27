package com.example.designpatterns.Observer.Observable;

import com.example.designpatterns.Observer.Observe.Notification;

public interface Observable {

    public void add(Notification notification);
    public void remove(Notification notification);
    public void notifyObservers();
    public void set(int count);
    public int get();
}
