package tech.kcmodev;

public class Main {

    public static void main(String[] args) {
	    Bedroom theBedroom = new Bedroom(2, 2);
	    Bathroom theBathroom = new Bathroom(1, "Large");
	    Basement theBasement = new Basement(4, "Unfinished");

	    House theHouse = new House(3, 15, "Wood", theBedroom, theBathroom, theBasement);

        System.out.println("The bedroom has " + theBedroom.getNumberOfBeds() + " beds, and " + theBedroom.getNumberOfClosets() + " closets.");
        theBedroom.goToSleep();
        System.out.println("\n");

        System.out.println("The bathroom has " + theBathroom.getNumberOfShowers() + " showers and it's size is " + theBathroom.getSize() + ".");
        theBathroom.takingAShower();
        System.out.println("\n");

        System.out.println("The basement has " + theBasement.getNumberOfEgressWindows() + " egress windows and is " + theBasement.getFinishedOrUnfinished() + ".");
        theBasement.exitingBasement();

        System.out.println("\n");
        theHouse.houseSetup();
    }
}
