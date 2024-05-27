package io.smartir.DesignPatterns.StrategyPattern.duckExample.behaviors.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am not flying duck!");
    }
}
