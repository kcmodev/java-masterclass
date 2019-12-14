package tech.kcmodev;


import java.text.DecimalFormat;

public class Burger {

    DecimalFormat df = new DecimalFormat("#.00");

    private String rollType;
    private String meatType;
    private String customerName;
    private double topping1;
    private double topping2;
    private double topping3;
    private double topping4;
    private double burgerCost;

    public Burger(String rollType, String meatType, String customerName, boolean hasLettuce, boolean hasOnion, boolean hasTomato, boolean hasSauce) {
        this.rollType = rollType;
        this.meatType = meatType;
        this.customerName = customerName;

        System.out.println("\n" + this.customerName + "'s burger is ready and has the following components:");
        System.out.print("Roll Type: " + this.rollType + ", Meat: " + this.meatType + ", with toppings: ");

        setHasLettuce(hasLettuce);
        setHasOnion(hasOnion);
        setHasTomato(hasTomato);
        setHasSauce(hasSauce);
    }

    public void setBurgerCost(double cost) {
        this.burgerCost = cost;
    }

    public void getBurgerCost(){
        System.out.println("The base cost of this type of burger is $" + df.format(this.burgerCost) + ".");
    }

    public void setHasLettuce(boolean hasLettuce) {
       if (hasLettuce){
            System.out.print("lettuce ");
            this.burgerCost += 0.25;
        }
    }

    public void setHasOnion(boolean hasOnion) {
        if (hasOnion){
            System.out.print("onion ");
            this.burgerCost += 0.25;
        }
    }

    public void setHasTomato(boolean hasTomato) {
       if (hasTomato){
            System.out.print("tomato ");
            this.burgerCost += 0.25;
        }
    }

    public void setHasSauce(boolean hasSauce) {
       if (hasSauce){
            System.out.print("sauce ");
            this.burgerCost += 0.25;
        }
    }

    public void addToPrice(double number){
        this.burgerCost += number;
    }

    public void totalPrice(){
        System.out.println("\nThe total price for " + this.customerName + "'s burger is: $" + df.format(this.burgerCost) + ".");
        System.out.println("Price includes ");
    }
}
