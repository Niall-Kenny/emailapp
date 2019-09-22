package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailBoxCapacity;
    private int defaultPasswordLength = 8;

    // Constructor to receive lastname and firstname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call a method requesting the department
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }
    //Ask for department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) return "Sales";
        else if (depChoice == 2) return "Development";
        else if (depChoice == 3) return "Accounting";
        else return "";
    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789£#@!%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
            System.out.println(random);
            System.out.println(passwordSet.charAt(random));
        }
        return new String(password);
    }

    // set the mailbox capacity

    // set the alternate email

    // change the password
}
