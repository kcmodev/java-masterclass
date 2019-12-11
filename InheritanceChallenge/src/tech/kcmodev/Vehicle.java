package tech.kcmodev;

public class Vehicle {

    private String frontOrRearDrive;
    private int numberOfGears;
    private int topSpeed;
    private int numberOfDoors;

    public Vehicle(){
        this("No Entry", 0, 0, 0);
    }

    public Vehicle(String frontOrRearDrive, int numberOfGears, int speed, int numberOfDoors) {
        this.frontOrRearDrive = frontOrRearDrive;
        this.numberOfGears = numberOfGears;
        this.topSpeed = speed;
        this.numberOfDoors = numberOfDoors;
    }

    public void steeringDirection(String cardinalDirection){
        System.out.println("You are now driving " + cardinalDirection + ".");
    }

    public String getFrontOrRearDrive() {
        return frontOrRearDrive;
    }

    public void setFrontOrRearDrive(String frontOrRearDrive) {
        this.frontOrRearDrive = frontOrRearDrive;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setSpeed(int speed) {
        this.topSpeed = speed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
