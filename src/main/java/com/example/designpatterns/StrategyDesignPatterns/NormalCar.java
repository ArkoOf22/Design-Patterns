package com.example.designpatterns.StrategyDesignPatterns;
import com.example.designpatterns.StrategyDesignPatterns.strategy.NormalDriveStrategy;
public class NormalCar extends Car {
    public NormalCar(){
        super(new NormalDriveStrategy());
    }
}
