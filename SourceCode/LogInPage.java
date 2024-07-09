package EnrollmentSystem.SourceCode;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.*;

public class LogInPage extends Credentials{
    
    private  boolean loop = true;  // Loop condition
    private  int input;           // User role scanner
    protected int adminAccountID;  // admin account ID scanner 
    private  Object adminPassword;  // admin password scanner
    private  int studentAccountID;  // student accound ID scanner
    private  Object studentPassword;  // student password scanner
    private int minimumID = 6;       //Minimum 6 characters for ID 
    private int minimumPassword = 8; // Minimum of 8 Characters for Password 
    final static String outputFilePath = "G:\\Data Information Files\\AdminCredentials.txt"; //File path for Admin Credentials

   // Asks the user if they are going to log in or register
     public void userPage(Scanner scan){
        
        while(loop){
            try {
                System.out.println("Please choose your action:");

                System.out.println("1. Register");
                System.out.println("2. Log In");

                System.out.print("Enter here: ");
                int input = scan.nextInt();

                switch(input){

                    case 1 -> userRegister(scan);

                    case 2 -> userLogIn(scan);

                    default -> loop = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                break;
            }
        }
    }
    // Asks the user what is their role
     public void userLogIn(Scanner logIn){

        while(loop){
            
            try {
                System.out.println("Welcome to Log In Page!");
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
      // Registration Method
    public void userRegister(Scanner scan){
       
        while(true){

             try {
                
                System.out.println("Welcome to Registration Page!");

                System.out.print("Please Enter your School ID: ");
                int registerID = scan.nextInt();

                System.out.print("Please Enter your Password: ");
                String registerPassword = scan.nextLine();

                if(registerID < minimumID){
                  System.out.println("Minimum of 6 characters for School ID");
                 }else if(registerPassword.length() < minimumPassword){
                   System.out.println("Minimum of 8 Characters for password!");
                   }else{
                    adminCredentials.put(registerID,registerPassword);
                    System.out.println("Registered Successful!");
                    userLogIn(scan);
                     break;
                 }
             } catch (InputMismatchException e) {
                System.out.println("Invalid ID Input!");
                break;
            }
        }  
    }
   // if user is admin, they will go here. The admin login 
    public void adminCredential(Scanner logIn){
   while(true){
        try {
        
            System.out.print("Account ID: ");
            adminAccountID = logIn.nextInt();
                             logIn.nextLine();

       } catch (java.util.InputMismatchException  e) {

            System.out.println("Invalid Account ID!");
            break;
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
      }
    // If user is student, they will go here. The Student Log In
    public void studentCredential(Scanner logIn){

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

    public static void main(String[]args) {
    Scanner scan =  new Scanner(System.in);
       // Data Placeholder using Hashmap 
        adminCredentials.put(54321, "fefri");
        adminCredentials.put( 9876, "Hello");
        adminCredentials.put(8888, "World");
        adminCredentials.put(12345, "Hi");

        studentCredentials.put(2023, "OuM");
        studentCredentials.put(2024, "Yes");
   
        File file = new File(outputFilePath);
        
        BufferedWriter bf = null;

         try {
            
            bf  = new BufferedWriter(new FileWriter(file));

             for(Entry<Integer, Object> entry : adminCredentials.entrySet()){
                 bf.write(entry.getKey() + ":" + entry.getValue());

                 // new Line
                  bf.newLine();
             }
              bf.flush();
         } catch (IOException e) {
             e.printStackTrace();


         }finally{

            try{
                //always close the writer
                bf.close();
            }catch(Exception e){

             }
         }
        new LogInPage().userPage(scan);

    }
}
