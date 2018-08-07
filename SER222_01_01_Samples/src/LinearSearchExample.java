/**
 * This program provides an implementation of the linear search algorithm
 * and demonstrates it.
 * 
 * @author Acuna
 * @version 1.0
 */
import java.util.Scanner;

public class LinearSearchExample
{   
    public static boolean find(int target, int[] pool)
    {
      for(int i = 0; i < pool.length; i++)
        if(pool[i] == target)
          return true;
          
      return false;   
    }
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int[] data = {4, 45, 8, 1, 3, 3, 22, 9};
        int target;
        
        System.out.println("What is the target number?");
        target = scanner.nextInt();
        if(find(target, data))
          System.out.println("Found.");
        else
          System.out.println("Missing.");
    }
}
