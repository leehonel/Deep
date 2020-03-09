package controlflowstatements;
import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowStatements {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int userAge;
            System.out.print("Hello, please enter your age: ");
        userAge = reader.nextInt();
        
        //check for logical errors
        if (userAge < 0 || userAge > 100) 
        {
            System.out.println("Sorry, please enter a valid age number. \nThe value should be between 0 and 100");
        }
        else if (userAge <= 17) {
            System.out.println("Sorry, you are underage and cannot proceed with the process");    
        }
        else if ( userAge < 21 || userAge > 18 ) {
            System.out.println("You are eligeble for the event, but first you need parental consent");
            
        }
        else if (userAge >= 22) {
            
            System.out.println("Congratulations! \nYou are successfuly signed up. See you at the event.");
                    
        }
        else{
            System.out.println("Please enter a valid age to proceed.");
        }
        
       
        //The Ternary operator
        int experienceYears, points;
        System.out.print("Please enter your years of experience in the field: ");
        experienceYears = reader.nextInt();
        points = experienceYears > 10 ? 100 : 50;   //By using the ternary operator here, if the value of the experienceYears is greater than 10, the points variable will be assigned a value of 100, otherwise it will be assigned a value of 50.
        //System.out.printf("The experience years you entered are: %d and that gets you %d points.", experienceYears+points)
        System.out.println("The years of experience you entered are: "+experienceYears+" \nand that gets you "+points+" points.");
    
        
        //Switch Statement
        //Here we will use a string variable for switching
        String userMonth;
        System.out.print("\nEnter your birth month(all in lowercase): ");
        userMonth = reader.next();
       // System.out.println(Arrays.toString(userMonth.split(userMonth)));
        switch (userMonth)
        {
            case "january":
            case "february":
            case "march":
                System.out.println("You were born in the first quater of the year.");
                break;
            case "april":
            case "may":
            case "june":
                System.out.println("You were born in the second quarter of the year.");
                break;
            case "july":
            case "august":
            case "september":
                System.out.println("You were born in the third quarter of the year");
                break;
            case "october":
            case "november":
            case "december":
                System.out.println("You were born in the final quarter of the year");
                break;
            
            default:
                System.out.println("Please confirm if you entered the month in the correct format!");
        }
        
        
        //Looping Statements
        
        
        if (experienceYears > 5) {
        
        //1. For Statement
        // System.out.print("\n\nThe number series is: ");
        //int numberSeries = reader.nextInt();
        //int numberSeries = reader.nextInt();
        //System.out.println("The resultant number series is:");
        
        //this 'for' block will execute iff the experienceYears condition is met
        for(int i = 0; i <= experienceYears; i++){
            System.out.print(+i+" ");
            // This will cause the program to exit this for loop if the value for experienceYears is == 8
            if (experienceYears == 8){
                break;
            } 
        }
        System.out.println("\n\n");
        }
        
        
        
        //Enhanced For statement
        int[] myNumbers = {10, 20, 30, 40, 50};
        System.out.println("\n\nEnhanced For Statement");
        //myNumbers = {10, 20, 30, 40};
        for(int a : myNumbers)
            System.out.println(a);
            
    
        
        //The Continue Statement
        for(int i = 0; i<5; i++){
            System.out.println("i = "+i);
            if(i==3)
                continue;
            System.out.println("This line is not printed when i=3");
        }
        
        
        //error handling 
        //The code in the catch block is executed iff the one in the try block isn't
        //Catching general errors
        int num, deno;
        try{
            System.out.print("\n\nError Handling\n\nEnter the numerator: ");
            num = reader.nextInt();
            System.out.print("Enter the denominator: ");
            deno = reader.nextInt();
            System.out.println("The result is: "+num/deno);
        }
        catch(Exception e) /*This tries to catch a general error. Exception refers to the class that the error belongs to and e is the name to the given error.*/{     
            System.out.println(e.getMessage());     
        }
        finally{
            System.out.println("-----End of Error Handling------");
        }
        
        //Catching Specific errors
    
    }
    
}
