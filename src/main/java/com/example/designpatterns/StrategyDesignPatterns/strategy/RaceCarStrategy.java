package com.example.designpatterns.StrategyDesignPatterns.strategy;

public class RaceCarStrategy implements ConcreteStrategy{

    @Override
    public void drive() {
        System.out.println("Driving in race car mode");
    }
}
