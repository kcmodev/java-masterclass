package tech.kcmodev;

public class Basement {

    private int numberOfEgressWindows;
    private String finishedOrUnfinished;

    public Basement(int numberOfEgressWindows, String finishedOrUnfinished) {
        this.numberOfEgressWindows = numberOfEgressWindows;
        this.finishedOrUnfinished = finishedOrUnfinished;
    }

    public void exitingBasement(){
        System.out.println("Exiting the basement via the stairs.");
    }

    public int getNumberOfEgressWindows() {
        return numberOfEgressWindows;
    }

    public String getFinishedOrUnfinished() {
        return finishedOrUnfinished;
    }
}
