package EnrollmentSystem.SourceCode;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

public class EnrollmentManagement {

    private int userInput;
    private int studentAge;
    private boolean looping = true;
    private String studentFullName;
    private String studentGender;
    private ArrayList <String> studentName = new ArrayList <String> ();
    private ArrayList <Integer> studentID = new ArrayList <Integer> ();
    private ArrayList <Integer> studentAges = new ArrayList <Integer> ();
    private ArrayList <String> studentGenderIdentity = new ArrayList <String>();  

   EnrollmentManagement(){


   }
    // To access the datas from ArrayList Student Names
   public ArrayList<String> getStudentName(){
    return studentName;
   }
   // To access the datas from ArrayList Student IDs
   public ArrayList<Integer> getStudentID(){
    return studentID;
   }
   // To access the datas from ArrayList Student Ages
   public ArrayList<Integer> getStudentAges(){
     return studentAges;
   }
   // To access the datas from ArrayList Student Genders
   public ArrayList<String> getStudentGenderIdentity(){
    return studentGenderIdentity;
   }

   public void adminEnrollment(Scanner enroll){

    while(looping){

        System.out.println("Please Enter the Student Informations to proceed.");

        System.out.print("Enter the Student Name: ");
        studentFullName = enroll.nextLine();
        studentFullName = enroll.nextLine(); 
      try {

        System.out.print("Enter Age: ");
        studentAge = enroll.nextInt();

        System.out.print("Enter Gender: ");
        studentGender = enroll.next();
        
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
             adminViewEnrollees(enroll);
             looping = false;
             break;
    
            case 3:
             adminRemoveEnrollee(enroll);
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

   public void adminViewEnrollees(Scanner sc){
      

     for(int i = 0; i < studentID.size(); i++){
          System.out.println( "Student ID: " + studentID.get(i));
          System.out.println("Student Name: " + studentName.get(i));
          System.out.println("Age: " + studentAges.get(i));
          System.out.println("Gender: " + studentGenderIdentity.get(i)); 
          System.out.println("");
        }
      
       while(looping){

        try {
          System.out.println("Choose your next Action:\n");
        
          System.out.println("1. Enroll a Student");
          System.out.println("2. View Enrollees");
          System.out.println("3. Remove a Student");
          System.out.println("4. Exit\n");
  
          System.out.print("Enter here: ");
          int enter = sc.nextInt();
  
          switch (enter) {
  
            case 1:
              adminEnrollment(sc);
              looping = false;
               break;
  
            case 2:
              adminViewEnrollees(sc);
              looping = false;
              break;
        
            case 3:
              adminRemoveEnrollee(sc);
              looping = false;
              break;
              
            case 4:
              new LogInPage(sc);
              looping = false;
              break;
        
            default:
             looping = true;
        
           }  
        } catch (InputMismatchException e) {
           
           System.out.println("Invalid Input!");
           break;
          }  
       }
   }
      
     
     

   public void adminRemoveEnrollee(Scanner scan){
    
     System.out.println("Remove Enrollee Section");

     for(int i = 0; i < studentID.size(); i++){
      System.out.println( "Student ID: " + studentID.get(i));
      System.out.println("Student Name: " + studentName.get(i));
      System.out.println("Age: " + studentAges.get(i));
      System.out.println("Gender: " + studentGenderIdentity.get(i)); 
      System.out.println("");
    
      }     

      while(looping){
         try {
          System.out.print("Enter the Student ID: ");
          int delete = scan.nextInt();

          if(studentID.contains(delete)){
             for(int d = 0; d < studentID.size(); d++){
                
               if(studentID.get(d) == delete){

                   studentID.remove(studentID.get(d));
                   studentName.remove(studentName.get(d));
                   studentAges.remove(studentAges.get(d));
                   studentGenderIdentity.remove(studentGenderIdentity.get(d));
                   break;
               }
             }
            System.out.println("Student Removed Successfully!");

            for(int i = 0; i < studentID.size(); i++){
              System.out.println( "Student ID: " + studentID.get(i));
              System.out.println("Student Name: " + studentName.get(i));
              System.out.println("Age: " + studentAges.get(i));
              System.out.println("Gender: " + studentGenderIdentity.get(i)); 
              System.out.println("");
        
               }   
            }else{
               System.out.println("Student ID does not exists!");
            }

         } catch (Exception e) {
            System.out.println("Invalid Student ID Input!");
            break;
         }

         try {
          System.out.println("Choose your next action:\n");
          System.out.println("1. Enroll new student");
          System.out.println("2. View Enrollees");
          System.out.println("3. Remove a student");
          System.out.println("4. Exit");
 
          System.out.print("Enter here: ");
          int input = scan.nextInt();
 
          switch (input) {
   
           case 1:
             adminEnrollment(scan);
             looping = false;
              break;
 
           case 2:
             adminViewEnrollees(scan);
             looping = false;
             break;
       
           case 3:
             adminRemoveEnrollee(scan);
             looping = false;
             break;
             
           case 4:
             new LogInPage(scan);
             looping = false;
             break;
       
           default:
            looping = true;
       
            }
         } catch (Exception e) {
           System.out.println("Invalid Input!");
           break;
         } 
      }
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

        switch(userInput){

          case 1: 
           adminEnrollment(scanner);
           looping = false;
           break;

          case 2:
           adminViewEnrollees(scanner);
           looping = false;
           break;

          case 3:
           adminRemoveEnrollee(scanner);
           looping = false;
           break;

          default:
           looping = true;
       }

    } catch (java.util.InputMismatchException e) {
  
          System.out.println("Invalid Input!");
          break;
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
