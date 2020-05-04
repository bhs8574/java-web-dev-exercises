package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;


    @Override
    public String toString() {
        return "Course ->" +
                "Topic: " + topic + '\'' +
                ", Instructor: " + instructor +
                ", Enrolled Students: " + enrolledStudents.toString();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic);
    }
}
