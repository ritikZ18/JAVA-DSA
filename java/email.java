package emailApp;
import java.util.Scanner;


public class email {

   private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private int passwordLength = 10; //set the length
    private String alternateEmail;
    private String companySuffix = "chase.com";



    //Constructor to recieve the firstname and lastname
    public email(String firstName, String lastName) {
        //.this refers to the class of variable or refer to local varaible
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        //Method for the random password
        String hello = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Email Created: " +hello);
        this.password = randomPassword(passwordLength);
        System.out.println("Password: " + this.password);

        //Combine elements to generate Email
    }

    //Ask for the department
    private String setDepartment()
    {
        System.out.println("Enter the Department\n1. Sales\n2. Development\n3. Accounting\n0. Exist\n Enter Department Code:\n");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Development";
        } else if (deptChoice == 3) {
            return"Accounting";
        } else if (deptChoice == 0) {
            return "Exist";
        } else {
            System.out.println("Invalid Choice");

        }

return department;
    }


    //Genrate a Random passwords
    private String randomPassword(int length){
        String passwordSet = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#\n$%^&*(<>?{}[]+_/)";
        char[] password = new char[length];
        for( int i=0;i<length;i++) {
          int random =  (int) (Math.random()*passwordSet.length());
          password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }



    //Setting up mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;

    }

    //Set alternate email

    public void setAlternateEmail(String altEmail) {

        this.alternateEmail = altEmail;
    }

    //Change Passowrd (future)
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    //get Methods
    public int getMailBoxCapacity(){ return mailBoxCapacity;}
    public String getAlternateEmail(){ return alternateEmail; }
    public String getPassword(){ return password; }

    public String showInfo()
    {
        String hello = "";
        return "Display Name: " + firstName+" "+lastName+"\ncompany: Chase Bank"+" "+"\nEmail: "+ hello + "\nMailBox Capacity: "+mailBoxCapacity;
    }


}
