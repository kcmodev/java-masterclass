package tech.kcmodev;

public class Car extends Vehicle {

    private String trunkType; //hatchback, regular etc
    private String windowType; //powered, manual etc

    public Car(String frontOrRearDrive, int numberOfGears, int topSpeed, String trunkType, String windowType) {
        super(frontOrRearDrive, numberOfGears, topSpeed, 4);
        this.trunkType = trunkType;
        this.windowType = windowType;
    }

    public void changeGears(int gear){
        System.out.println("You are now in gear #" + gear + ".");
    }

    public String getTrunkType() {
        return trunkType;
    }

    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }

    public String getWindowType() {
        return windowType;
    }

    public void setWindowType(String windowType) {
        this.windowType = windowType;
    }
}
