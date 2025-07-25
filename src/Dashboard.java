

import java.util.Scanner;

public class Dashboard {

    private boolean looper = true;  // Condition for while loop
    private int choice;  // Scanner input

    Dashboard(){


    }
      // Admin Dashboard
    public void adminDashboard(Scanner dashboard){
      
      while(looper){

      System.out.println("Please choose your category: ");

      System.out.println("1. Course Management");
      System.out.println("2. Enrollment Management");
      System.out.println("3. Student Management");

    // To handle input mismatch 
      try {

         System.out.print("Enter your choice here: ");
         choice = dashboard.nextInt();
         
      } catch (java.util.InputMismatchException e) {

         System.out.println("Invalid Input!");
         break;
      }     

        switch(choice){

          case 1: 
           looper = false;
           new CourseManagement();
           break;

          case 2:
           looper = false;
           new EnrollmentManagement().adminManagement(dashboard);
           break;

          case 3:
           looper = false;
           new StudentManagement().adminStudentManagement(dashboard);;
           break;
           
          default:
           looper = true;
       } 
    }
 }
     
   // Student Dashboard Method
     public void studentDashboard(Scanner dashboard){

    while(looper){

        System.out.println("Please choose your category: ");

        System.out.println("1. Course Management");
        System.out.println("2. Enrollment Management");

       
        try {

            System.out.print("Enter your choice here: ");
            choice = dashboard.nextInt();
            
        } catch (java.util.InputMismatchException e) {

           System.out.println("Invalid Input!");
           break;
        }

          switch(choice){

            case 1: 
             looper = false;
             new CourseManagement();
             break;

            case 2:
             looper = false;
             new EnrollmentManagement();
             break;

            default:
             looper = true;
         } 
      }
   }
}
