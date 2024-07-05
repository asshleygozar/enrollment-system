package EnrollmentSystem.SourceCode;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagement {

    private LinkedList <Integer> CS01 = new LinkedList<Integer>();
    private LinkedList <Integer> CS02 = new LinkedList<Integer>();
    private LinkedList <Integer> CS03 = new LinkedList<Integer>();
    private LinkedList <Integer> CS04 = new LinkedList<Integer>();

    private LinkedList <String> CS01studentNames = new LinkedList<String>();
    private LinkedList <Integer> CS01studentAge = new LinkedList<Integer>();
    private LinkedList <String> CS01studentGender = new LinkedList<String>();

    private LinkedList <String> CS02studentNames = new LinkedList<String>();
    private LinkedList <Integer> CS02studentAge = new LinkedList<Integer>();
    private LinkedList <String> CS02studentGender = new LinkedList<String>();

    private LinkedList <String> CS03studentNames = new LinkedList<String>();
    private LinkedList <Integer> CS03studentAge = new LinkedList<Integer>();
    private LinkedList <String> CS03studentGender = new LinkedList<String>();

    private LinkedList <String> CS04studentNames = new LinkedList<String>();
    private LinkedList <Integer> CS04studentAge = new LinkedList<Integer>();
    private LinkedList <String> CS04studentGender = new LinkedList<String>();

    public void adminStudentManagement(Scanner scan){

    }

    public void adminAddNewStudents(Scanner scan){
       
        while(true){
            
            try {
                 System.out.println("Welcome Admin! Choose your Class.\n");

                 System.out.println("1. CS01");
                 System.out.println("2. CS02");
                 System.out.println("3. CS03");
                 System.out.println("4. CS04\n");
       
                 System.out.print("Enter here: ");
                 int input = scan.nextInt();

                 switch(input){
                 
                  case 1:
                   addClassCS01(scan);
                   break;
                   
                  case 2:
                   addClassCS02(scan);
                   break;

                  case 3:
                   addClassCS03(scan);
                   break;

                  case 4:
                   addClassCS04(scan);
                   break;

                  default:
                    
                }
            } catch (InputMismatchException e) {
                 System.out.println("Invalid Input!");
            }
        }
    }

    public void addClassCS01(Scanner scan){

     while(true){
        
        try {
           System.out.print("Enter here: ");

           System.out.print("Student ID: \n");
           int userInput = scan.nextInt();
 
        if(!new EnrollmentManagement().getStudentID().contains(userInput)){
            System.out.println("Student ID does not exist!");
           }else{

               for(int i = 0; i < new EnrollmentManagement().getStudentID().size(); i++){
                  
                  if(new EnrollmentManagement().getStudentID().contains(new EnrollmentManagement().getStudentID().get(i))){
                
                     CS01.add(new EnrollmentManagement().getStudentID().get(i));
                     CS01studentNames.add(new EnrollmentManagement().getStudentName().get(i));
                     CS01studentAge.add(new EnrollmentManagement().getStudentAges().get(i));
                     CS01studentGender.add(new EnrollmentManagement().getStudentGenderIdentity().get(i));
                }
            }
        } 

             } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                break;   
          }
       }      
    }

    public void addClassCS02(Scanner scan){

        while(true){
        
            try {
               System.out.print("Enter here: ");
    
               System.out.print("Student ID: \n");
               int userInput = scan.nextInt();
     
            if(!new EnrollmentManagement().getStudentID().contains(userInput)){
                System.out.println("Student ID does not exist!");
               }else{
    
                   for(int i = 0; i < new EnrollmentManagement().getStudentID().size(); i++){
                      
                      if(new EnrollmentManagement().getStudentID().contains(new EnrollmentManagement().getStudentID().get(i))){
                    
                         CS02.add(new EnrollmentManagement().getStudentID().get(i));
                         CS02studentNames.add(new EnrollmentManagement().getStudentName().get(i));
                         CS02studentAge.add(new EnrollmentManagement().getStudentAges().get(i));
                         CS02studentGender.add(new EnrollmentManagement().getStudentGenderIdentity().get(i));
                    }
                }
            } 
    
                 } catch (InputMismatchException e) {
                    System.out.println("Invalid Input!");
                    break;   
            }
        } 
    }

    public void addClassCS03(Scanner scan){

        while(true){
        
            try {
               System.out.print("Enter here: ");
    
               System.out.print("Student ID: \n");
               int userInput = scan.nextInt();
     
            if(!new EnrollmentManagement().getStudentID().contains(userInput)){
                System.out.println("Student ID does not exist!");
               }else{
    
                   for(int i = 0; i < new EnrollmentManagement().getStudentID().size(); i++){
                      
                      if(new EnrollmentManagement().getStudentID().contains(new EnrollmentManagement().getStudentID().get(i))){
                    
                         CS03.add(new EnrollmentManagement().getStudentID().get(i));
                         CS03studentNames.add(new EnrollmentManagement().getStudentName().get(i));
                         CS03studentAge.add(new EnrollmentManagement().getStudentAges().get(i));
                         CS03studentGender.add(new EnrollmentManagement().getStudentGenderIdentity().get(i));
                    }
                }
            } 
    
                 } catch (InputMismatchException e) {
                    System.out.println("Invalid Input!");
                    break;   
            }
        } 
    }

    public void addClassCS04(Scanner scan){
        while(true){
        
            try {
               System.out.print("Enter here: ");
    
               System.out.print("Student ID: \n");
               int userInput = scan.nextInt();
     
            if(!new EnrollmentManagement().getStudentID().contains(userInput)){
                System.out.println("Student ID does not exist!");
               }else{
    
                   for(int i = 0; i < new EnrollmentManagement().getStudentID().size(); i++){
                      
                      if(new EnrollmentManagement().getStudentID().contains(new EnrollmentManagement().getStudentID().get(i))){
                    
                         CS04.add(new EnrollmentManagement().getStudentID().get(i));
                         CS04studentNames.add(new EnrollmentManagement().getStudentName().get(i));
                         CS04studentAge.add(new EnrollmentManagement().getStudentAges().get(i));
                         CS04studentGender.add(new EnrollmentManagement().getStudentGenderIdentity().get(i));
                    }
                }
            } 
    
                 } catch (InputMismatchException e) {
                    System.out.println("Invalid Input!");
                    break;   
            }
        } 
    }
    // Main page for choosing which section the student's information belong to
    public void adminUpdateStudentDetails(Scanner scan){
      
        while(true){

            try {
                System.out.println("Select Section\n");
                System.out.println("1. CS01");
                System.out.println("2. CS02");
                System.out.println("3. CS03");
                System.out.println("4. CS04\n");

                System.out.print("Enter here: ");
                int userInput = scan.nextInt();

                switch(userInput){

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                break;
            }
        }
    }
    // Update Information Method for Class CS01
    public void updateClassCS01(Scanner scan){
        System.out.println("Welcome to Class CS01, Please choose student you want to update.\n");

         for(int i = 0; i < CS01.size(); i++){
        System.out.println("Student ID: " + CS01.get(i));
        System.out.println("Student Name: " + CS01studentNames.get(i));
        System.out.println("Student Age: " + CS01studentAge.get(i));
        System.out.println("Student Gender: " + CS01studentGender.get(i));
       }

       while(true){
          
         try {
            System.out.print("Enter student ID: ");
            int userInput = scan.nextInt();

             if(CS01.contains(userInput)){

                for(int i = 0; i < CS01.size(); i++){
                    if(CS01.get(i) == userInput){
                      
                      System.out.print("Enter Student Name: ");
                      String updatedName = scan.nextLine();

                      System.out.print("Enter Student Age: ");
                      int updatedAge = scan.nextInt();

                      System.out.print("Enter Student Gender: ");
                      String updatedGender = scan.nextLine();

                      CS01studentNames.set(i, updatedName);
                      CS01studentAge.set(i, updatedAge);
                      CS01studentGender.set(i, updatedGender);
                      
                      System.out.println("Student " + CS01.get(i) + "Information, Successfully Updated!");
                     }
                 }

             }else{
                 System.out.println("Student ID does not exists!");
             }
         } catch (InputMismatchException e) {
              System.out.println("Invalid Input!");
              break;
            }
        }

        while(true){
         
            try {
             System.out.println("Choose your Next Action: \n");
 
             System.out.println("1. Add new Student");
             System.out.println("2. Update Student Information");
             System.out.println("3. Remove a Student");
             System.out.println("4. Back");
             System.out.println("5. Exit\n");
    
             System.out.print("Enter here: ");
             int userInput = scan.nextInt();
 
             switch(userInput){
 
                 case 1:
                  break;
 
                 case 2:
                  break;
 
                 case 3:
                  break;
 
                 case 4:
                  break;
 
                 case 5:
                  break;
 
                 default:
             }
            } catch (Exception e) {
               System.out.println("Invalid Input!");
               break;
            }
        }
    }
     // Update Information Method for Class CS04
    public void updateClassCS02(Scanner scan){
        System.out.println("Welcome to Class CS02, Please choose student you want to update.\n");

        for(int i = 0; i < CS02.size(); i++){
       System.out.println("Student ID: " + CS02.get(i));
       System.out.println("Student Name: " + CS02studentNames.get(i));
       System.out.println("Student Age: " + CS02studentAge.get(i));
       System.out.println("Student Gender: " + CS02studentGender.get(i));
      }

      while(true){
         
        try {
           System.out.print("Enter student ID: ");
           int userInput = scan.nextInt();

            if(CS02.contains(userInput)){

               for(int i = 0; i < CS02.size(); i++){
                   if(CS02.get(i) == userInput){
                     
                     System.out.print("Enter Student Name: ");
                     String updatedName = scan.nextLine();

                     System.out.print("Enter Student Age: ");
                     int updatedAge = scan.nextInt();

                     System.out.print("Enter Student Gender: ");
                     String updatedGender = scan.nextLine();

                     CS02studentNames.set(i, updatedName);
                     CS02studentAge.set(i, updatedAge);
                     CS02studentGender.set(i, updatedGender);
                     
                     System.out.println("Student " + CS02.get(i) + "Information, Successfully Updated!");
                    }
                }

            }else{
                System.out.println("Student ID does not exists!");
            }
        } catch (InputMismatchException e) {
             System.out.println("Invalid Input!");
             break;
           }
       }

       while(true){
         
           try {
            System.out.println("Choose your Next Action: \n");

            System.out.println("1. Add new Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. Remove a Student");
            System.out.println("4. Back");
            System.out.println("5. Exit\n");
   
            System.out.print("Enter here: ");
            int userInput = scan.nextInt();

            switch(userInput){

                case 1:
                 break;

                case 2:
                 break;

                case 3:
                 break;

                case 4:
                 break;

                case 5:
                 break;

                default:
            }
           } catch (Exception e) {
              System.out.println("Invalid Input!");
              break;
           }
       }
    }
   //  Update Information Method for Class CS03
    public void updateClassCS03(Scanner scan){
        System.out.println("Welcome to Class CS03, Please choose student you want to update.\n");

        for(int i = 0; i < CS03.size(); i++){
       System.out.println("Student ID: " + CS03.get(i));
       System.out.println("Student Name: " + CS03studentNames.get(i));
       System.out.println("Student Age: " + CS03studentAge.get(i));
       System.out.println("Student Gender: " + CS03studentGender.get(i));
      }

      while(true){
         
        try {
           System.out.print("Enter student ID: ");
           int userInput = scan.nextInt();

            if(CS03.contains(userInput)){

               for(int i = 0; i < CS03.size(); i++){
                   if(CS03.get(i) == userInput){
                     
                     System.out.print("Enter Student Name: ");
                     String updatedName = scan.nextLine();

                     System.out.print("Enter Student Age: ");
                     int updatedAge = scan.nextInt();

                     System.out.print("Enter Student Gender: ");
                     String updatedGender = scan.nextLine();

                     CS03studentNames.set(i, updatedName);
                     CS03studentAge.set(i, updatedAge);
                     CS03studentGender.set(i, updatedGender);
                     
                     System.out.println("Student " + CS03.get(i) + "Information, Successfully Updated!");
                    }
                }

            }else{
                System.out.println("Student ID does not exists!");
            }
        } catch (InputMismatchException e) {
             System.out.println("Invalid Input!");
             break;
           }
       }

       while(true){
         
           try {
            System.out.println("Choose your Next Action: \n");

            System.out.println("1. Add new Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. Remove a Student");
            System.out.println("4. Back");
            System.out.println("5. Exit\n");
   
            System.out.print("Enter here: ");
            int userInput = scan.nextInt();

            switch(userInput){

                case 1:
                 break;

                case 2:
                 break;

                case 3:
                 break;

                case 4:
                 break;

                case 5:
                 break;

                default:
            }
           } catch (Exception e) {
              System.out.println("Invalid Input!");
              break;
           }
       }
    }
   // Update Information Method for Class CS04
    public void updateClassCS04(Scanner scan){
        System.out.println("Welcome to Class CS04, Please choose student you want to update.\n");

        for(int i = 0; i < CS04.size(); i++){
       System.out.println("Student ID: " + CS04.get(i));
       System.out.println("Student Name: " + CS04studentNames.get(i));
       System.out.println("Student Age: " + CS04studentAge.get(i));
       System.out.println("Student Gender: " + CS04studentGender.get(i));
      }

      while(true){
         
        try {
           System.out.print("Enter student ID: ");
           int userInput = scan.nextInt();

            if(CS04.contains(userInput)){

               for(int i = 0; i < CS04.size(); i++){
                   if(CS04.get(i) == userInput){
                     
                     System.out.print("Enter Student Name: ");
                     String updatedName = scan.nextLine();

                     System.out.print("Enter Student Age: ");
                     int updatedAge = scan.nextInt();

                     System.out.print("Enter Student Gender: ");
                     String updatedGender = scan.nextLine();

                     CS04studentNames.set(i, updatedName);
                     CS04studentAge.set(i, updatedAge);
                     CS04studentGender.set(i, updatedGender);
                     
                     System.out.println("Student " + CS04.get(i) + "Information, Successfully Updated!");
                    }
                }

            }else{
                System.out.println("Student ID does not exists!");
            }
        } catch (InputMismatchException e) {
             System.out.println("Invalid Input!");
             break;
           }
       }

       while(true){
         
           try {
            System.out.println("Choose your Next Action: \n");

            System.out.println("1. Add new Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. Remove a Student");
            System.out.println("4. Back");
            System.out.println("5. Exit\n");
   
            System.out.print("Enter here: ");
            int userInput = scan.nextInt();

            switch(userInput){

                case 1:
                 break;

                case 2:
                 break;

                case 3:
                 break;

                case 4:
                 break;

                case 5:
                 break;

                default:
            }
           } catch (Exception e) {
              System.out.println("Invalid Input!");
              break;
           }
       }
    }

    public void adminDeleteStudents(){

    }

    public void studentViewDetails(){

    }

    public void studentUpdateDetails(){

    }
}
