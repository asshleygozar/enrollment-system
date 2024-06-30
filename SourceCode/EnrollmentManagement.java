package EnrollmentSystem.SourceCode;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnrollmentManagement {

    private int userInput;
    private int studentAge;
    private boolean looping = true;
    public String studentFullName;
    private char studentGender;
    private List <String> studentName = new ArrayList <String> ();
    private List <Integer> studentID = new ArrayList <Integer> ();
    private List <Integer> studentAges = new ArrayList <Integer> ();
    private List <Character> studentGenderIdentity = new ArrayList <Character>();  

   EnrollmentManagement(){


   }

   public void adminEnrollment(Scanner enroll){

    while(looping){

        System.out.println("Please Enter the Student Informations to proceed.");

        System.out.print("Enter the Student Name: ");
        studentFullName = enroll.next();
                          
      try {

        System.out.print("Enter Age: ");
        studentAge = enroll.nextInt();

        System.out.print("Enter Gender: ");
        studentGender = enroll.next().charAt(0);
        
      } catch (java.util.InputMismatchException e) {

        System.out.println("Invalid Input!");
        break;
       }
          Random identification = new Random();

        int studentIdentity = identification.nextInt(1000000);

       System.out.println("Student ID: "  + studentIdentity);
       System.out.println("Student Name: " + studentFullName);
       System.out.println("Student Age: " + studentAge);
       System.out.println("Student Gender: " + studentGender);

       studentName.add(studentFullName);
       studentID.add(studentIdentity);
       studentAges.add(studentAge);
       studentGenderIdentity.add(studentGender);

       System.out.println("Student Added Successful!");

       while(looping){
     
        System.out.println("Choose your Next Action: ");

        System.out.println("1. Enroll a student in a course.");
        System.out.println("2. View all Enrollments.");
        System.out.println("3. Remove a student from a course.");
        System.out.println("4. Exit");

        try {
          
          System.out.print("Enter here: ");
          userInput = enroll.nextInt();

          switch(userInput){
   
            case 1:
             adminEnrollment(enroll);
             looping = false;
             break;
    
            case 2:
             adminViewEnrollees();
             looping = false;
             break;
    
            case 3:
             adminRemoveEnrollee();
             looping = false;
             break;
    
            case 4: 
             new LogInPage(enroll);
             looping = false;
             break;
    
            default:
            System.out.println("1 to 4 Only!!");
              
            }
        } catch (java.util.InputMismatchException e) {

          System.out.println("Invalid Input!");
          break;

         }
       } 
     }
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
             adminEnrollment(scanner);
             looping = false;
             break;

            case 2:
             looping = false;
             adminViewEnrollees();
             break;

            case 3:
             looping = false;
             adminRemoveEnrollee();
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
