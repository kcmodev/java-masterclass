package tech.kcmodev;

public class Tesla extends Car {

    private int totalBatteryCapacity;
    private int batteryPercentRemaining;
    private int timeToCharge;
    private String makeAndModel;

    public Tesla(String frontOrRearDrive, int numberOfGears, int topSpeed, String trunkType, String windowType, int totalBatteryCapacity, int batteryPercentRemaining, int timeToCharge, String makeAndModel) {
        super(frontOrRearDrive, numberOfGears, topSpeed, trunkType, windowType);
        this.totalBatteryCapacity = totalBatteryCapacity;
        this.batteryPercentRemaining = batteryPercentRemaining;
        this.timeToCharge = timeToCharge;
        this.makeAndModel = makeAndModel;
    }

    public void isCharging(boolean charging){
        if (charging == true){
            System.out.println("You are currently charging.");
        } else {
            System.out.println("You are not currently charging.");
        }
    }

    public int getTotalBatteryCapacity() {
        return totalBatteryCapacity;
    }

    public void setTotalBatteryCapacity(int totalBatteryCapacity) {
        this.totalBatteryCapacity = totalBatteryCapacity;
    }

    public int getBatteryPercentRemaining() {
        return batteryPercentRemaining;
    }

    public void setBatteryPercentRemaining(int batteryPercentRemaining) {
        this.batteryPercentRemaining = batteryPercentRemaining;
    }

    public int getTimeToCharge() {
        return timeToCharge;
    }

    public void setTimeToCharge(int timeToCharge) {
        this.timeToCharge = timeToCharge;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
}
