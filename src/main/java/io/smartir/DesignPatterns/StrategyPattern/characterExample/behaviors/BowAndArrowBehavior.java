package io.smartir.DesignPatterns.StrategyPattern.characterExample.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Firing an arrow");
    }
}
