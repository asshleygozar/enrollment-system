package EnrollmentSystem.SourceCode;

import java.util.Scanner;

public class Dashboard {

    private boolean looper = true;  // Condition for while loop
    private int input;  // Scanner input
    
     Dashboard(){

        Scanner dashboard = new Scanner(System.in);

        dashboard.close();
    }
    // admin Dashboard Method
     public void adminDashboard(Scanner dashboard){
    
        while(looper){

        System.out.println("Please choose your category: ");

        System.out.println("1. Course Management");
        System.out.println("2. Enrollment Management");

      // To handle input mismatch 
        try {

            System.out.print("Enter your choice here: ");
            input = dashboard.nextInt();
            
        } catch (java.util.InputMismatchException e) {

           System.out.println("Invalid Input!");
           break;
        }

          switch(input){

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
   // Student Dashboard Method
     public void studentDashboard(Scanner dashboard){

    while(looper){

        System.out.println("Please choose your category: ");

        System.out.println("1. Course Management");
        System.out.println("2. Enrollment Management");

        try {

            System.out.print("Enter your choice here: ");
            input = dashboard.nextInt();
            
        } catch (java.util.InputMismatchException e) {

           System.out.println("Invalid Input!");
           break;
        }

          switch(input){

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
