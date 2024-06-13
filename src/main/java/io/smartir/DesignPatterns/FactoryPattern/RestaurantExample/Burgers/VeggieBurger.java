package io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers;

public class VeggieBurger extends Burger{
    @Override
    public void prepare() {
        System.out.println("Add some salads to burger");
        cut();
        box();
    }
}
