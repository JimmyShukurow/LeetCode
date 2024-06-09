package io.smartir.DesignPatterns.DecoratorPattern.decorator;

import io.smartir.DesignPatterns.DecoratorPattern.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", Whip";
    }

    public double cost() {
        double cost = beverage.cost() + 0.10;
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        }
        return cost;
    }

}


