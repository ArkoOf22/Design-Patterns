package com.example.designpatterns.StrategyDesignPatterns;

public class Main {
    public static void main(String[] args) {
        Car normalCar = new NormalCar();
        normalCar.drive();
        Car offRoadCar = new OffRoadCar();
        offRoadCar.drive();
    }
}
