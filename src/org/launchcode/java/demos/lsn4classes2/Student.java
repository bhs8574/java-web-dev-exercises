package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    /*
    This method returns the student’s level based on the number of credits they have earned:
    Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)
     */
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60 ) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    /*
    This method accepts two parameters—a number of course credits and a numerical grade (0.0-4.0).
    With this data, you need to update the student’s GPA.
     */
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        this.gpa = Math.floor(((this.gpa * this.numberOfCredits)+(courseCredits * grade))/(this.numberOfCredits+courseCredits)*10)/10;
        this.numberOfCredits += courseCredits;
    }


    @Override
    public String toString() {
        return "Student-> " +
                "Name: " + name  +
                ", Student ID: " + studentId +
                ", Number of Credits: " + numberOfCredits +
                ", GPA: " + gpa;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, numberOfCredits, gpa);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
