package io.smartir.DesignPatterns.StrategyPattern.characterExample;

import io.smartir.DesignPatterns.StrategyPattern.characterExample.behaviors.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am a Knight");
    }
}
