package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "kenny.com";
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;

    // Constructor to receive lastname and firstname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        // call a method requesting the department
        this.department = setDepartment();


        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }
    //Ask for department
    private String setDepartment() {
        System.out.print("new employee: "+ firstName +". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) return "sales";
        else if (depChoice == 2) return "development";
        else if (depChoice == 3) return "accounting";
        else return "none";
    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789£#@!%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String email){
        this.alternateEmail = email;
    }

    // change the password
    public void setPassword(String password){
        this.password = password;
    }
    // get mailbox cap
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    //  get alternate email
    public String getAlternateEmail(){
        return this.alternateEmail;
    }
    // get password
    public String getPassword(){
        return password;
    }

    public String getInfo(){
        return  " DISPLAY NAME: " + firstName + " " + lastName +
                "\n COMPANY EMAIL: " + email +
                "\n MAILBOX CAPACITY: " + mailBoxCapacity +
                "\n ALTERNATE EMAIL: " + alternateEmail;
    }

}
