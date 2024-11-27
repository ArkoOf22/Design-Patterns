package com.example.designpatterns.StrategyDesignPatterns;

import com.example.designpatterns.StrategyDesignPatterns.strategy.RaceCarStrategy;

public class RaceCar extends Car {
    public RaceCar(){
        super(new RaceCarStrategy());
    }
}
