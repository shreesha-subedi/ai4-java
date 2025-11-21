package week3;
import java.util.Scanner;


/**
 * Write a description of class secconvetr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class secconvetr
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter seconds?");
        int num1=sc.nextInt();
        int hrs= num1/3600;
        num1=num1-hrs*3600;
        int mins=num1/60;
        num1=num1-mins*60;
        int sec=num1;
        System.out.println(hrs+"\n"+ mins+"\n"+sec);
        
        
    }
}