package week3;
import java.util.Scanner;


/**
 * Write a description of class daysconvetor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class daysconvetor
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days?");
        int days=sc.nextInt();
        int years=days/365;
        days=days-years*365;
        int months=days/30;
        days=days-months*30;
        int day=days;
        System.out.println("year"+years+"\n"+"month"+months+"\n"+"day"+day);
        
        
        
        
    }
    
}