import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
   public static void main (String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First Number:");
       int num1= sc.nextInt();
       System.out.println("Enter second Number:");
       int num2= sc.nextInt();
       int sum;
       sum=num1+num2;
       System.out.println("the sum of"+num1+"and"+num2+"is="+sum);
       int difference;
       difference=num1-num2;
       System.out.println("the difference of"+ num1+"and"+num2+"is="+ difference);
       int multiple;
       multiple= num1*num2;
       System.out.println("the multiplication of"+num1+"and"+num2+"is="+multiple);
       float divide;
       divide=(float)num1/num2;
       System.out.println("the division of"+num1+"and"+num2+"is="+divide);
       int remainder;
       remainder=num1%num2;
       System.out.println("the remainder is"+remainder);
       
       
       
    
    
       
   }
   
   
}