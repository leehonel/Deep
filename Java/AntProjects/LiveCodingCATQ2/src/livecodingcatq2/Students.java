package livecodingcatq2;
import java.util.Scanner;

public class Students {
    public String studentFirstName, studentLastName, studentRegNo, studentDetails;
    Scanner keyBoardInput = new Scanner(System.in);
    
    public void helloWorld(){
        System.out.println("Test one");
        //return world;
    }
    
      public Students(String studentIndex){
    //public String registerStudents(String studentIndex){
        //String = studentDetails;
        
        System.out.println("\nEnter the student details below");
        System.out.print("First Name: ");
        studentFirstName = keyBoardInput.next();
        System.out.print("Last Name: ");
        studentLastName = keyBoardInput.next();
        System.out.print("Registration Number: ");
        studentRegNo = keyBoardInput.next();
        
        studentDetails = "First Name: "+studentFirstName+"\nLast Name: "+studentLastName+"\nRegistration Number: "+studentRegNo;
        
        //return studentDetails;
        
    }
      public void studentList(){
          System.out.println(studentDetails);
      }
      
    
}
