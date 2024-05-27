package io.smartir.DesignPatterns.StrategyPattern.characterExample;

import io.smartir.DesignPatterns.StrategyPattern.characterExample.behaviors.BowAndArrowBehavior;

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am th Queen");
    }
}
