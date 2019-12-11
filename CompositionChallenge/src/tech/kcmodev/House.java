package tech.kcmodev;

public class House {

    private int numberOfDoors;
    private int numberOfWindows;
    private String typeOfFlooring;
    private Bedroom bedroom;
    private Bathroom bathroom;
    private Basement basement;

    public House(int numberOfDoors, int numberOfWindows, String typeOfFlooring, Bedroom bedroom, Bathroom bathroom, Basement basement) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.typeOfFlooring = typeOfFlooring;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.basement = basement;
    }

    public void houseSetup(){
        System.out.println("Performing all actions.");
        allActions();
    }

    private void allActions(){
        basement.exitingBasement();
        bathroom.takingAShower();
        bedroom.goToSleep();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getTypeOfFlooring() {
        return typeOfFlooring;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public Basement getBasement() {
        return basement;
    }
}
