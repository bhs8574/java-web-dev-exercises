package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        input.close();
    }

}
