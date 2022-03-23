package EmailAdministrationApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 200;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = ".company.com";

    //Constructor to recieve the firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department
        this.department = setDepartment();

        //Call a method that returns random password
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your Password Is: " + this.password);

        // Combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;

    }

    //Ask for department
    private String setDepartment(){
        System.out.println("New Employee: " + firstName + "\nEnter the department\n" +
                "1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "0 for none");

        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();

        if(departmentChoice == 1) return "sales";
        else if(departmentChoice == 2) return "dev";
        else if(departmentChoice == 3) return "accounting";
        else return "";
    }

    //Generate a random password
    private String generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#";
        char[] password = new char[length];

        for(int i=0; i<length; i++){
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set the mail box capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Define the alternate email adress
    public String getAlternateEmail() {
        return alternateEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
