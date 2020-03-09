package objectorienteddemo;

public class Staff{
    //this class is used to manage staff finances
    //start off with field declaration
    private final int hourlyRate = 30;  //the final keyword indicates that the variable value cannot be changed after it's declared. 
    private int hoursWorked;
    private String employeeName;
    
    public void printMessage(){
        System.out.println("Calculating pay...");    
    }
    
    public int calculatePay(){  //the int keyword indicates that the method returns a value that is of type int. 
        printMessage(); //this is a call to the printMessage method
        
        int staffPay;   //local variable declaration
        staffPay = hoursWorked * hourlyRate;    //reference to the fields declared above
        
        if (hoursWorked > 0){   //if the hours worked is > 0, the method will execute the statement. 
            return staffPay;
        }
        else 
            return -1;
        
    }
    
    
    //second calculatePay method to demonstrate overloading. 
    public int calculatePay(int bonus, int allowance){  //the signature of this method compared to the first one is different in that this one uses parameters
        printMessage();
        if (hoursWorked > 0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else 
            return 0;
    }
    
    
    //A setter method
    public void setHoursWorked(int hours){
        if (hours > 0)
            //here we accept the parameter called hours and use it to set the value of the hoursWorked field. 
            //but this value is only assigned iff it's greater than zero. 
            hoursWorked = hours;        
        else
        {
            System.out.println("Error: Hours worked cannot be smaller than zero.");
            System.out.println("Error: Hours worked is not updated.");
        }
    
    
    }
    
    
    //A getter method
    public int getHoursWorked(){
        //This method returns the value in the hours worked field. 
        return hoursWorked;
    }
    
    
    //A constructor
    public Staff(String name){
        //this constructor accepts a parameter called name and uses it to initialize the employeeName field and then displays its value. 
        employeeName = name; 
        System.out.println("\n" + employeeName);
        System.out.println("----------------------");
    }
    //A second constructor
    public Staff(String firstName, String lastName){
        employeeName = firstName + " " + lastName;  //this line concatenates the two strings and assigns the resulting string to the employeeName. 
        System.out.println("\n" + employeeName);
        System.out.println("----------------------");
    }
   
}
