package EnrollmentSystem.SourceCode;

import java.util.Map;
import java.util.Scanner;

public class LogInPage extends Credentials{
    
    private static boolean loop = true;  // Loop condition
    private static int input;           // User role scanner
    private static int adminAccountID;  // admin account ID scanner 
    private static Object adminPassword;  // admin password scanner
    private static int adminKey;
    private static Object adminValue; 
    private static int studentAccountID;  // student accound ID scanner
    private static Object studentPassword;  // student password scanner

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

            if(!adminCredentials.containsValue(adminAccountID)){
               System.out.println("Account ID does not Exist!");
               adminCredential(logIn);

              }else{
                System.out.print("Password: ");
                adminPassword = logIn.nextLine();
                       
                   for(Map.Entry<Integer, Object> checker : adminCredentials.entrySet()){
                       adminKey = checker.getKey();
                       adminValue = checker.getValue();
                   }
                   
                   Object pass = adminCredentials.getOrDefault(adminKey, adminValue);
                    if(pass != adminPassword){
                        System.out.println("Incorrect password!");
                        adminCredential(logIn);
     
                      }else{     
                        System.out.println("Log In Succcessful!");
                        System.out.println("Welcome to your dashboard user " + adminAccountID);     
               } 
            }  
         }
    // If user is student, they will go here. The Student Log In
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

        addAdminAccount(123, "Asshley");
        userLogIn(logIn);

       logIn.close(); 
    }
}
