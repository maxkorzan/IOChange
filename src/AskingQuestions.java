import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        //declare Scanner named "keyboard"
        Scanner keyboard = new Scanner(System.in);

        //prompt user for two temperatures
        System.out.print( "First temperature? " );
        double num1 = keyboard.nextDouble();

        System.out.print( "Second temperature? " );
        double num2 = keyboard.nextDouble();

        //display the largest value
        System.out.println("The max value is : " + Math.max(num1, num2));
    }
}