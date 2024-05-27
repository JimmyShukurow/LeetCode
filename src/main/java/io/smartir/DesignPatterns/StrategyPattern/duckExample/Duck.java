package io.smartir.DesignPatterns.StrategyPattern.duckExample;

import io.smartir.DesignPatterns.StrategyPattern.duckExample.behaviors.fly.FlyBehavior;
import io.smartir.DesignPatterns.StrategyPattern.duckExample.behaviors.quack.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void swim();

    public abstract void display();
}
