package io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers;

public abstract class Burger {
    public abstract void prepare();

    public void cut() {
        System.out.println("Cut burger");
    }

    public void box() {
        System.out.println("Box burger");
    }
}
