package EnrollmentSystem.SourceCode;

import java.util.Scanner;

public class LogInPage extends Credentials{
    
    private static boolean loop = true;
    private static int input;
    private static int adminAccountID;
    private static Object adminPassword;
    private static int studentAccountID;
    private static Object studentPassword;

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

    static void adminCredential(Scanner logIn){

        try {
        
            System.out.print("Account ID: ");
            adminAccountID = logIn.nextInt();
                        logIn.nextLine();

            System.out.print("Password: ");
            adminPassword = logIn.nextLine();

       } catch (Exception e) {

            System.out.println("Accound ID should be Integer Only!");
        
         } 
            if(!adminCredentials.containsKey(adminAccountID)){
               System.out.println("Account ID does not Exist!");
               adminCredential(logIn);

              }else{ 
                   
                    if(!adminCredentials.containsValue(adminPassword)){
                        System.out.println("Incorrect password!");
                        adminCredential(logIn);
     
                      }else{     
                        System.out.println("Log In Succcessful!");
                        System.out.println("Welcome to your dashboard user " + adminAccountID);     
               } 
            }  
         }

    static void studentCredential(Scanner logIn){

        try {
        
            System.out.print("Account ID: ");
            studentAccountID = logIn.nextInt();
                        logIn.nextLine();

            System.out.print("Password: ");
            studentPassword = logIn.nextLine();

       } catch (Exception e) {

            System.out.println("Accound ID should be Integer Only!");
        
         } 
            if(!studentCredentials.containsKey(studentAccountID)){
               System.out.println("Account ID does not Exist!");
               studentCredential(logIn);

              }else{ 
                   
                    if(!studentCredentials.containsValue(studentPassword)){
                        System.out.println("Incorrect password!");
                        studentCredential(logIn);
     
                      }else{     
                        System.out.println("Log In Succcessful!");
                        System.out.println("Welcome to your dashboard user " + studentAccountID);     
               } 
            }
         }

    public static void main(String[]args){

        Scanner logIn = new Scanner(System.in);

        adminCredentials.put(12345,"Asshley19?");
        studentCredentials.put(54321, "fefri");

        userLogIn(logIn);

       logIn.close(); 
    }
}
