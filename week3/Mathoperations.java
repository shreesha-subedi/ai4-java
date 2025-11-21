package week3;
import java.util.Scanner;


/**
 * Write a description of class Mathoperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mathoperations
{
   public static void main (String[]arg)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int num1=sc.nextInt();
    System.out.println("enter second number");
    int num2=sc.nextInt();
    int sum=num1+num2;
    float subtract=(float)num1-num2;
    int multiply=num1*num2;
    double divide=(double)num1/num2;
    int remainder=num1%num2;
    String greaternumber=(num1>num2)?num1+"is greater":num2+"is greater";
    boolean is_equal=(num1==num2)?true:false;
    System.out.println("Sum"+sum+"\n"+"subtract"+subtract+"\n"+"multiply"+multiply+"\n"+"divide"+divide+"\n"+"remainder"+remainder+"/n");
    System.out.println(greaternumber+is_equal);
    
    
    
    
    
    
    
}
   
}