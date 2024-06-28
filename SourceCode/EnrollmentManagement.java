package EnrollmentSystem.SourceCode;

import java.util.Scanner;
import java.util.ArrayList;

public class EnrollmentManagement {

    private int userInput;
    private boolean looping = true;
    private ArrayList <String> course = new ArrayList <String> ();

   EnrollmentManagement(){


   }

   public void adminEnrollment(){


   }

   public void adminViewEnrollees(){


   }

   public void adminRemoveEnrollee(){
    

   }
   
   public void adminManagement(Scanner scanner){

    while(looping){

      System.out.println("Choose your Action: ");

      System.out.println("1. Enroll a student in a course.");
      System.out.println("2. View all Enrollments.");
      System.out.println("3. Remove a student from a course.");
    
    try {
    
        System.out.print("Enter here: ");
        userInput = scanner.nextInt();

    } catch (java.util.InputMismatchException e) {
  
          System.out.println("Invalid Input!");
          break;
         }

         switch(userInput){

            case 1: 
             looping = false;
             break;

            case 2:
             looping = false;
             break;

            case 3:
             looping = false;
             break;

            default:
             looping = true;
         }
      } 
   }

   public void studentEnrollment(){


   }

   public void studentViewEnrollements(){


   }

   public void studentDropCourse(){
    
    
   }
   
   public void studentManagement(Scanner scanner){

    while(looping){

      System.out.println("Choose your Action: ");

      System.out.println("1. Enroll a Course");
      System.out.println("2. View your Enrollments.");
      System.out.println("3. Drop Course");
    
    try {
    
        System.out.print("Enter here: ");
        userInput = scanner.nextInt();

    } catch (java.util.InputMismatchException e) {
  
          System.out.println("Invalid Input!");
          break;
         }

         switch(userInput){

            case 1: 
             looping = false;
             break;

            case 2:
             looping = false;
             break;

            case 3:
             looping = false;
             break;

            default:
             looping = true;
         }
      } 
   }
}
