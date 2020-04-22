package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentId;

        System.out.println("Enter your student's ID Number (or -1 to finish):");

        // Get student names and IDs
        do {

            System.out.print("Student ID Number: ");
            newStudentId = input.nextInt();

            if (newStudentId != -1) {
                System.out.print("Name: ");
                String newName = input.next();
                students.put(newStudentId, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(newStudentId != -1);

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }


    }
}