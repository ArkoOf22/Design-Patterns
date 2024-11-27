package com.example.designpatterns.StrategyDesignPatterns.strategy;

public class NormalDriveStrategy implements ConcreteStrategy{

    @Override
    public void drive() {
        System.out.println("Driving in normal mode");
    }
}
