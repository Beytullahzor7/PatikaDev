package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students we want to add
        System.out.println("How many students would u like to add? ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        Student[] studentList = new Student[numberOfStudents];

        //Create n number of new students
        for(int i=0; i<numberOfStudents; i++){
            studentList[i] = new Student();
            studentList[i].enroll();
            studentList[i].payTuition();
            System.out.println(studentList[i].toString());
        }
    }
}
