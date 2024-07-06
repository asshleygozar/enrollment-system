package EnrollmentSystem.SourceCode;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CourseManagement {

    private List <String> courses = new ArrayList<String>();
    private boolean loop = true;
  
     // Method for choosing which action to take
    public void adminCourseManagement(Scanner scan){

        while(loop){
            try {
                 System.out.println("Welcome to Course Management!\n");

                 System.out.println("Please choose your action: ");
                 System.out.println("1. Add Course");
                 System.out.println("2. Update Existing Course");
                 System.out.println("3. Delete Courses\n");

                 System.out.print("Enter here: ");
                 int input = scan.nextInt();

                 switch(input){

                    case 1:
                     adminAddCourse(scan);
                     loop = false;
                     break;

                    case 2:
                     adminUpdateCourse(scan);
                     loop = false;
                     break;

                    case 3:
                     adminDeleteCourses(scan);
                     loop = false;
                     break;

                    default:
                     loop = true;
                     
                 }
                
            } catch (InputMismatchException e) {
                 System.out.println("Invalid Input!");
                 break;
            }
        }
    }
    // Method for Adding Course
    public void adminAddCourse(Scanner scan){
      
        while(true){

            System.out.println("Please Enter the Courses you want to Add\n");
        
            System.out.print("Enter here");
            String userInput = scan.nextLine();
            courses.add(userInput);

            System.out.print("Do you want to add more courses?");
            String input = scan.nextLine();
            
            switch(input){

                case "Yes":
                 adminAddCourse(scan);
                 break;

                case "No":
                  try {
                    System.out.println("Choose your Next Action: \n");
 
             System.out.println("1. Add new Course");
             System.out.println("2. Update Course");
             System.out.println("3. Delete Course");
             System.out.println("4. Back");
             System.out.println("5. Exit\n");
    
             System.out.print("Enter here: ");
             int nextAction = scan.nextInt();
 
             switch(nextAction){
 
                 case 1:
                  adminAddCourse(scan);
                  break;
 
                 case 2:
                  adminUpdateCourse(scan);
                  break;
 
                 case 3:
                  adminDeleteCourses(scan);
                  break;
 
                 case 4:
                 new Dashboard().adminDashboard(scan);
                  break;
 
                 case 5:
                 new LogInPage(scan);
                  break;
 
                 default:
             }
                  } catch (InputMismatchException e) {
                    
                  }
                 break;

                default: 
            }
        }
        
    }
     // Method for Updating Course
    public void adminUpdateCourse(Scanner scan){
     
    }
     // Method for Deleteing Courses
    public void adminDeleteCourses(Scanner scan){

    }
     // Method for Student Viewing their Courses
    public void studentViewCourse(Scanner scan){


    }
}
