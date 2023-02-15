import java.util.Scanner; //Import of Scanner
public class MetricConverter
{
    public static void main(String[] args)
    {
        double meters;  //Variable declaration
        double miles;   //Variable declaration
        double feet;    //Variable declaration
        double inches;  //Variable declaration
        final double VAR_METER = 1609.344;    //Constant variable declaration and assignment
        final double VAR_FEET = 3.2808; //Constant variable declaration and assignment
        final double VAR_INCHES = 39.370;   //Constant variable declaration and assignment
        String trash = "";  //Variable declaration and assignment
        Scanner in = new Scanner(System.in);    //Declaration and assignment of Scanner utility

        System.out.println("Enter measurement in meters");  //Prompt user for input

        if (in.hasNextDouble()) //Check and validate user input
            {
                meters = in.nextDouble(); //Assigning user input to variable
                miles = meters / VAR_METER; //Calculation process
                System.out.println("Meters converted to miles is " + String.format("%f", miles));    //Output statement
                feet = meters * VAR_FEET;   //Calculation process
                System.out.println("Meters converted to feet is " + feet);  //Output statement
                inches = meters * VAR_INCHES;   //Calculation process
                System.out.println("Meters converted to inches is " + inches);  //Output statement
                in.nextLine();  //Clearing the buffer
            }
        else    //Other process if user input fails the check
            {
                trash = in.nextLine();  //Assignment of bad input from user
                System.out.println("Incorrect value: " + trash + "." + " Must enter valid measurement for meters.");    //Output statement
            }
    }
}
