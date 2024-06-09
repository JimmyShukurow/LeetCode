package io.smartir.DesignPatterns.DecoratorPattern.decorator;

import io.smartir.DesignPatterns.DecoratorPattern.Beverage;

public abstract  class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();
    @Override
    public double cost() {
        return 0;
    }

    public Size getSize() {
        return beverage.getSize();
    }
}
