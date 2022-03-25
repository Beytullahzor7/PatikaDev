package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the student class level: ");
        int n = input.nextInt();
        if(n>=1 && n<=4) this.gradeYear = n;
        else throw new IllegalArgumentException("You did not input a value between the range");
        setStudentId();

    }
    //Generate ID
    private void setStudentId(){
        //Grade level + id
        id++;
        this.studentID = gradeYear+""+id;
    }
    //Enroll courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if(!course.equals("Q")){
                courses += " " + course + " ";
                tuitionBalance+=costOfCourse;
            }
            else{
                break;
            }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your Balance Is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance-=payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    //Show status
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentID='" + studentID + '\'' +
                ", courses='" + courses + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }
}
