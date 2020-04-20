package exercises;

import java.util.Scanner;

public class CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the rectangle's length: ");
        int length = input.nextInt();
        System.out.println("Please enter the rectangle's width: ");
        int width = input.nextInt();
        System.out.println("The area of a rectangle with " +
                "length: "+length+" and width: "+width+" is" +
                ": "+ length*width);
        input.close();
    }
}
