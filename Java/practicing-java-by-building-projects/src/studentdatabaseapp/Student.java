package studentdatabaseapp;

import java.util.Scanner;

import static java.lang.System.out;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int id = 1000;

    //Constructor: prompt use to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }
    // Generate an Id
    private void setStudentID() {
        //Grade Level = ID
        id++;
       this.studentID = gradeYear + "" + id;
    }
    //Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
        out.print("Enter course to enroll(Q or q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine().toUpperCase();
        if(!course.equals("Q")) {
            courses = courses + ("\n " + course);
            int costOfCourse = 600;
            tuitionBalance += costOfCourse;
        } else {break;}
        } while (true);
    }
    //Pay Tuition
    public void payTuition() {
        viewBalance();
        out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //View Balance
    public void viewBalance() {
        out.println("Your balance is: $" + tuitionBalance);
    }

    //Show status
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\n Student ID: " + studentID +
                "\nCourse Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
