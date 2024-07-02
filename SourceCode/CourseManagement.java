package EnrollmentSystem.SourceCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CourseManagement {

    private boolean loop = true;

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

    public void adminAddCourse(Scanner scan){


    }

    public void adminUpdateCourse(Scanner scan){

    }

    public void adminDeleteCourses(Scanner scan){

    }

    public void studentViewCourse(Scanner scan){


    }
}
