package objectorienteddemo;
import java.util.Scanner;

public class ObjectOrientedDemo {

    public static void main(String[] args) {
        Scanner keyBoardInput = new Scanner(System.in);
        //Instantiating an object from the staff method
        //Staff staff1;
        //staff1 = new Staff("Peter");
        Staff staffOne = new Staff("Peter");
        staffOne.setHoursWorked(160); //using the public setter method from the Staff class. 
        int pay = staffOne.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);
        
        
       
        /*
        String nameOne, nameTwo;
        System.out.print("Enter name one: ");
        nameOne = keyBoardInput.nextLine();
        System.out.print("Enter name two: ");
        nameTwo = keyBoardInput.nextLine();
        
        Staff staffTwo = new Staff(nameOne, nameTwo);
        System.out.println("The salary of "+staffTwo+"is "+pay);
        */
    }

    
}
