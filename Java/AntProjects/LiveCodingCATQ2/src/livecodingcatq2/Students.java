package livecodingcatq2;
import java.util.Scanner;

public class Students {
    public String studentFirstName, studentLastName, studentRegNo;
    public static String studentDetails;
    Scanner keyBoardInput = new Scanner(System.in);
    
    public void helloWorld(){
        System.out.println("Test one");
        //return world;
    }
    
      public Students(String studentIndex){
    //public String registerStudents(String studentIndex){
        //String = studentDetails;
        
        int number;
        System.out.print("How many students would you like to register: ");
        number = keyBoardInput.nextInt();
        for (int i = 0; i < number; i++) {
            
            System.out.print("First Name: ");
            studentFirstName = keyBoardInput.next();
            System.out.print("Last Name: ");
            studentLastName = keyBoardInput.next();
            System.out.print("Registration Number: ");
            studentRegNo = keyBoardInput.next();
            System.out.println("\n");
            
            
            
            studentDetails = "First Name: "+studentFirstName+"\nLast Name: "+studentLastName+"\nRegistration Number: "+studentRegNo;
                
            

        }
      
        
        
        
        //return studentDetails;
        
    }
      public static void studentList(){
          System.out.println(studentDetails);
      }
      
    
}
