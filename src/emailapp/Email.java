package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailBoxCapacity;

    // Constructor to receive lastname and firstname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call a method requesting the department
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        // call a method that returns a random password
    }
    //Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) return "Sales";
        else if (depChoice == 2) return "Development";
        else if (depChoice == 3) return "Accounting";
        else return "";
    }

    // Generate random password

    // set the mailbox capacity

    // set the alternate email

    // change the password
}
