package com.example.designpatterns.StrategyDesignPatterns;

import com.example.designpatterns.StrategyDesignPatterns.strategy.RaceCarStrategy;

public class OffRoadCar extends Car {
    public OffRoadCar(){
        super(new RaceCarStrategy());
    }
}
