/**
 * Recursive implementations of methods that compute a factorial, compute a
 * Fibonacci number, and display a list.
 * 
 * @author Acuna
 * @version 1.0
 */
public class RecursiveSamples {
    public static int factorial(int n) {
        if(n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }
    
    public static long fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        
        return fib(n-1) + fib(n-2);
    }
    
    //iterative
    public static void displayListIterative(LinearNode node) {
      LinearNode iter = node;
      
      while(iter != null) {
        System.out.println(iter);
        iter = iter.getNext();
      }
    }

    //recursive
    public static void displayList(LinearNode node) {
      if(node != null) {
        System.out.println(node);
        displayList(node.getNext());
      }
    }
}