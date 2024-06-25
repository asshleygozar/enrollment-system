package EnrollmentSystem.SourceCode;

import java.util.Map;
import java.util.Scanner;

public class LogInPage extends Credentials{
    
    private static boolean loop = true;  // Loop condition
    private static int input;           // User role scanner
    protected static int adminAccountID;  // admin account ID scanner 
    private static Object adminPassword;  // admin password scanner
    private static int studentAccountID;  // student accound ID scanner
    private static Object studentPassword;  // student password scanner

    LogInPage(){

       
    }

    // Asks the user what is their role
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

                 case 1:
                  loop = false;
                  adminCredential(logIn);
                  break;
                
                 case 2:
                 loop = false;
                 studentCredential(logIn);
                 break;

                 default:
                   loop = true;   
               }                   
            } catch (java.util.InputMismatchException e) {
               
               System.out.println("Integers Number Only!");
               break;
            }   
        } 
    }
   // if user is admin, they will go here. The admin login 
    static void adminCredential(Scanner logIn){

        try {
        
            System.out.print("Account ID: ");
            adminAccountID = logIn.nextInt();
                             logIn.nextLine();

       } catch (java.util.InputMismatchException  e) {

            System.out.println("Invalid Account ID!");
       
         } 

            if(!adminCredentials.containsKey(adminAccountID)){
               System.out.println("Account ID does not Exist!");
               adminCredential(logIn);

              }else{
                System.out.print("Password: ");
                adminPassword = logIn.nextLine();
                       
                   for(Map.Entry<Integer, Object> checker : adminCredentials.entrySet()){
                       checker.getKey();
                       checker.getValue();
                   }
                   
                    if(!adminCredentials.get(adminAccountID).equals(adminPassword)){
                        System.out.println("Incorrect password!");
                        adminCredential(logIn);
     
                      }else{     
                        System.out.println("Log In Succcessful!");
                        System.out.println("Welcome to your dashboard user " + adminAccountID);  
                        new Dashboard().adminDashboard(logIn);;   
               } 
            }  
         }
    // If user is student, they will go here. The Student Log In
    static void studentCredential(Scanner logIn){

        try {
        
            System.out.print("Account ID: ");
            studentAccountID = logIn.nextInt();
                               logIn.nextLine();

        } catch (Exception e) {

            System.out.println("Accound ID should be Integer Only!");
            
         } 

             System.out.print("Password: ");
             studentPassword = logIn.nextLine();

            if(!studentCredentials.containsKey(studentAccountID)){
               System.out.println("Account ID does not Exist!");
               studentCredential(logIn);

              }else{ 

                for(Map.Entry<Integer, Object> checker : adminCredentials.entrySet()){
                    checker.getKey();
                    checker.getValue();
                }
                   
                    if(!studentCredentials.get(studentAccountID).equals(studentPassword)){
                        System.out.println("Incorrect password!");
                        studentCredential(logIn);
     
                      }else{     
                        System.out.println("Log In Succcessful!");
                        System.out.println("Welcome to your dashboard user " + studentAccountID);
                        new Dashboard().studentDashboard(logIn);     
               } 
            }
         }

    public static void main(String[]args){

        Scanner logIn = new Scanner(System.in);
        
       // Data Placeholder using Hashmap 
        adminCredentials.put(54321, "fefri");
        adminCredentials.put( 9876, "Hello");
        adminCredentials.put(8888, "World");
        adminCredentials.put(12345, "Hi");

        studentCredentials.put(2023, "OuM");
        studentCredentials.put(2024, "Yes");

        userLogIn(logIn);

       logIn.close(); 
    }
}
