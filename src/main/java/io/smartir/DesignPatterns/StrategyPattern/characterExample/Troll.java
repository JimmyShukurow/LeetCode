package io.smartir.DesignPatterns.StrategyPattern.characterExample;

import io.smartir.DesignPatterns.StrategyPattern.characterExample.behaviors.KnifeBehavior;

public class Troll extends Character{
    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am Troll");
    }
}
