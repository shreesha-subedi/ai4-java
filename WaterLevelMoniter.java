import java.util.Scanner;

/**
 * Write a description of class WaterLevelMoniter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMoniter
{
   public static void main (String[]arg)
   {
       int waterLevel;
     waterLevel= 1000;
     System.out.println("the current water level is:"+waterLevel);
     
     String result=(waterLevel>=1000)?"Warning Waterlevel is over 1000liters"
    :"status Normal";
     System.out.println(result); 
     
     
     
       
       
   }
   
}