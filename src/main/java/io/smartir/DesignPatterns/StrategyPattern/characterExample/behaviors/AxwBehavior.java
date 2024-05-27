package io.smartir.DesignPatterns.StrategyPattern.characterExample.behaviors;

public class AxwBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Chopping with Axes");
    }
}
