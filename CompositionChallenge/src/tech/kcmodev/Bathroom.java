package tech.kcmodev;

public class Bathroom {

    private int numberOfShowers;
    private String size; //small, med, large etc

    public Bathroom(int numberOfShowers, String size) {
        this.numberOfShowers = numberOfShowers;
        this.size = size;
    }

    public void takingAShower(){
        System.out.println("Taking a shower.");
    }

    public int getNumberOfShowers() {
        return numberOfShowers;
    }

    public String getSize() {
        return size;
    }
}
