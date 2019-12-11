package tech.kcmodev;

public class Main {

    public static void main(String[] args) {
	    Tesla modelX = new Tesla("Rear", 6, 120, "Hatchback", "Power", 100, 98, 20, "Tesla Model X");

        System.out.println("Vehicle Attributes:");
        System.out.println("\nMake & Model: " + modelX.getMakeAndModel());
        System.out.println("Windows: " + modelX.getWindowType());
        System.out.println("Doors: " + modelX.getNumberOfDoors());
        System.out.println("Trunk: " + modelX.getTrunkType());
        System.out.println("Gears: " + modelX.getNumberOfGears());
        System.out.println("Drivetrain: " + modelX.getFrontOrRearDrive());
        System.out.println("Top speed: " + modelX.getTopSpeed() + " mph");
        System.out.println("Battery capacity: " + modelX.getTotalBatteryCapacity() + " kWh");
        System.out.println("Battery percent remaining: " + modelX.getBatteryPercentRemaining() + "%");
        System.out.println("Time to charge: " + modelX.getTimeToCharge() + " minutes");

        System.out.println("\n");
        modelX.steeringDirection("West");
        modelX.changeGears(5);
        modelX.isCharging(true);

        Vehicle blank = new Vehicle();

        System.out.println("Vehicle attributes: ");
        System.out.println("\nDrivetrain: " + blank.getFrontOrRearDrive());
        System.out.println("Doors: " + blank.getNumberOfDoors());
        System.out.println("Gears: " + blank.getNumberOfGears());
        System.out.println("Top speed: " + blank.getTopSpeed());
    }
}
