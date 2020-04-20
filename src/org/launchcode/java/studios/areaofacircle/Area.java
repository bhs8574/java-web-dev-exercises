package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double PI = 3.14159;
        double radius;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter a radius: ");
                radius = input.nextDouble();
            }
            catch(Exception e) {
                input.next();
                System.out.println("Sorry, something went wrong!  Are you sure you entered a number?");
                radius = -1.0;
            }
        } while (radius < 0 );
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        input.close();
    }

}
