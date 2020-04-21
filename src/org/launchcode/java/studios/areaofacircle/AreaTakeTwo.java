/*
################
This was just to help Tom trouble shoot a bit
###############
 */



package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static java.lang.Math.round;


public class AreaTakeTwo {

    public static void main (String[] args) {
        //ask for radius -- repeat until valid input is provided -- methodcall with output
        //request radius
        System.out.println("What is your radius: ");
        Scanner input = new Scanner(System.in);
        double r;

        //start loop and continue until valid input is provided.
        //validated input assigned to r
        do {
            while (!input.hasNextDouble() || input.nextDouble() <= 0) {
                System.out.println("You must choose a number above zero,\nwhat is your radius: ");
                input.nextLine();
            }
//                System.out.println("1");
//            if()

            r = Double.parseDouble(input.match().group());
        } while (r <= 0);

        input.close();

        //area of circle method call and final output
        double area = Circle.getArea(r);
        System.out.println("The area for circle of radius " + r + " is: " + round(area*1000)/1000.);
    }
}