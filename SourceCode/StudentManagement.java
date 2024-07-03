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

    public void adminAddNewStudents(Scanner scan){
       
        while(true){
            
            try {
                 System.out.println("Welcome Admin! Class.\n");

                 System.out.println("1. CS01");
                 System.out.println("2. CS02");
                 System.out.println("3. CS03");
                 System.out.println("4. CS04\n");
       
                 System.out.print("Enter here: ");
                 int input = scan.nextInt();

                 switch(input){
                 
                  case 1:
                   classCS01(scan);
                   break;

                  case 2:
                   break;

                  case 3:
                   break;

                  case 4:
                   break;

                  default:
                      
                }
            } catch (InputMismatchException e) {
                 System.out.println("Invalid Input!");
            }
        }
    }

    public void classCS01(Scanner scan){

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
    }

    public void classCS02(){
        
    }

    public void classCS03(){
        
    }

    public void classCS04(){
        
    }

    public void adminUpdateStudentDetails(){

    }

    public void adminDeleteStudents(){

    }

    public void studentViewDetails(){

    }

    public void studentUpdateDetails(){

    }
}
