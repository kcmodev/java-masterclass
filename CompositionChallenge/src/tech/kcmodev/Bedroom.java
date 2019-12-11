package tech.kcmodev;

public class Bedroom {

    private int numberOfBeds;
    private int numberOfClosets;

    public Bedroom(int numberOfBeds, int numberOfClosets) {
        this.numberOfBeds = numberOfBeds;
        this.numberOfClosets = numberOfClosets;
    }

    public void goToSleep(){
        System.out.println("Going to the bedroom to go to sleep.");
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getNumberOfClosets() {
        return numberOfClosets;
    }

}
