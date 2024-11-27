package com.example.designpatterns.StrategyDesignPatterns;

import com.example.designpatterns.StrategyDesignPatterns.strategy.ConcreteStrategy;

public class Car {
    ConcreteStrategy strategy;
    Car(ConcreteStrategy strategy){
        this.strategy = strategy;
    }
    public void drive(){
        strategy.drive();
    }
}
