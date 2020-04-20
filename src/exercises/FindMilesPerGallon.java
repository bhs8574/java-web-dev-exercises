package exercises;

import java.util.Scanner;

public class FindMilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the number of miles" +
                " you have driven: ");
        double miles = input.nextDouble();
        System.out.println("Please enter the number of gallons of" +
                " gas you have used: ");
        double gallons = input.nextDouble();
        System.out.println("Your current miles per gallon value is: " + miles/gallons);
        input.close();
    }

}
