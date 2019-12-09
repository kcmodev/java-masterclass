import java.util.Scanner;

public class inputThenPrintSumAndAverage {

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int num = 0;
        int counter = 0;


        while (true) {
            System.out.println("Enter your number(s): ");
            boolean validInput = userInput.hasNextInt();
            System.out.println("counter = " + counter);

            if (validInput) {
                num = userInput.nextInt();
                sum += num;
                counter++;
            } else {
                System.out.println("counter in exit  = " + counter);
                avg = sum / counter;
                break;
            }
            userInput.nextLine();
        }
        userInput.close();
        System.out.println("SUM = " + sum + "AVG = " + avg);
    }
}
