package inputoutput;
import java.util.Scanner;


public class InputOutput {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);    //this is a scanner object named reader
        
        System.out.print("Enter an interger: ");
        int myInt; 
        double myDouble;
        String myString;
        myInt = reader.nextInt();   //this will read the value of myInt from the keyboard input
        System.out.printf("The value you entered is: %d", myInt);
        System.out.print("\n Enter a double: ");
        myDouble = reader.nextDouble(); //this will read the value of myDouble from the keyboard input
        System.out.printf("The double you entered is: %.2f\n", myDouble);
        System.out.print("Enter a string: ");
        myString = reader.next();   //this will read the value of myString from the keyboard input.
        System.out.printf("The string you entered is: %s\n", myString);
    
    }
    
    
}
