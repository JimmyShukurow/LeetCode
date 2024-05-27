package io.smartir.DesignPatterns.StrategyPattern.duckExample.behaviors.fly;

public  class FlyRocketBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying like rocket!");
    }
}
