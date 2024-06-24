package EnrollmentSystem.SourceCode;

import java.util.Scanner;

public class LogInPage extends Credentials{
    
    private static boolean loop = true;
    private static int input;

     static void userLogIn(Scanner logIn){

        while(loop){
            
            try {
   
                System.out.println(" What is your role?");

                System.out.println("1.  Admin");
                System.out.println("2. Student");

                System.out.print("Enter your role: ");
                input = logIn.nextInt();
                        logIn.nextLine();       

                switch(input){

                 case 1 -> loop = false;

                 case 2 -> loop = false;

                 default -> loop = true;   

                 }   
                   
            } catch (java.util.InputMismatchException e) {
               
               System.out.println("Integers Number Only!");
               break;
            }
            
            
        } 
    }

    static void adminCredentials(Scanner logIn){

        

        System.out.print("Account ID: ");
        int accountID = logIn.nextInt();
                        logIn.nextLine();

        System.out.println("Password: ");
        Object password = logIn.nextLine();

    }

    public static void main(String[]args){

        Scanner logIn = new Scanner(System.in);

        adminCredentials.put(12345,"Asshley19?");
        studentCredentials.put(54321, "fefri");

        userLogIn(logIn);

       logIn.close(); 
    }
}
