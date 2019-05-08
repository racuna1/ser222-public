import java.util.Scanner;

/**
 * This program provides an implementation of the linear search algorithm
 * and demonstrates it.
 * @author Acuna, Sedgewick
 * @version
 */
public class SearchSolutions {  
    public static boolean searchLinear(int target, int[] pool)
    {
      for(int i = 0; i < pool.length; i++)
        if(pool[i] == target)
          return true;
          
      return false;   
    }
    
    public static boolean searchBinary(int target, int[] pool)
    {
        int lo = 0;
        int hi = pool.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < pool[mid])
                hi = mid - 1;
            else if (target > pool[mid])
                lo = mid + 1;
            else
                return true;
        }
        return false; 
    }
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int[] data = {4, 45, 8, 1, 3, 3, 22, 9};
        int target;
        
        System.out.println("What is the target number?");
        target = scanner.nextInt();
        if(searchLinear(target, data))
          System.out.println("Found.");
        else
          System.out.println("Missing.");
    }
}