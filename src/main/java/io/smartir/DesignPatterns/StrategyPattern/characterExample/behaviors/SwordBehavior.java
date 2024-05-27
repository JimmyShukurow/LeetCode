package io.smartir.DesignPatterns.StrategyPattern.characterExample.behaviors;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Swing a sword");
    }
}
