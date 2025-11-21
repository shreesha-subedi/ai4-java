import java.util.Scanner;

/**
 * Write a description of class userinput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class userinput
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstValue=sc.nextInt();
        System.out.println("Enter the secondNumber");
        int secondValue=sc.nextInt();
        int sum=firstValue+secondValue;
        System.out.println("the sum of two value is"+sum);
        
        
    }
    
}