package tech.kcmodev;

public class RyeRollBurger extends Burger {

   public RyeRollBurger(String rollType, String meatType, String customerName, boolean hasLettuce, boolean hasOnion, boolean hasTomato) {
        super(rollType, meatType, customerName, hasLettuce, hasOnion, hasTomato, false);

        super.addToPrice(2.00); //$2 for the rye bun
        super.addToPrice(1.00); //$1 for special sauce


    }
}
