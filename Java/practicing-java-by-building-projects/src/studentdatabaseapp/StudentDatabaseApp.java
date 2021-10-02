package studentdatabaseapp;

import java.util.Scanner;

import static java.lang.System.*;

public class StudentDatabaseApp {

    public static void main (String[] args) {

        // Ask how many users we want to add
        out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create a number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            }
        for (int i = 0; i < numOfStudents; i++) {
            out.println(students[i].toString());

        }
    }
}
