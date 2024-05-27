package io.smartir.DesignPatterns.StrategyPattern.duckExample.behaviors.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am not quacking duck!");
    }
}
