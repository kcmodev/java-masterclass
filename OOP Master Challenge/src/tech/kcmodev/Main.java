package tech.kcmodev;

public class Main {

    public static void main(String[] args) {
        Burger steve = new Burger("Wheat", "Beef", "Steve", true, true, false, true);
        steve.totalPrice();

        RyeRollBurger katie = new RyeRollBurger("Rye", "Beef", "Katie", true, true, true);
        katie.totalPrice();

        HealthyBurger willie = new HealthyBurger("Willie", true, true, true, true);
        willie.totalPrice();
    }
}
