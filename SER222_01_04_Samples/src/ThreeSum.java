/**
 * Computes the number of triples that sum to zero in an array.
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++)   
           for (int j = i+1; j < N; j++)
              for (int k = j+1; k < N; k++)
                 if (a[i] + a[j] + a[k] == 0)
                    count++;
         return count;
    }
    
    public static void main(String[] args) {
       int[] a = {23, 32, 5, 103, 12, 10, 45, 3, 4, 5, 23, 23, 32, 5, 103, 52, 134, 45, 3, 4, 45, 234, 12, 10, 45};
       
       Stopwatch stopwatch = new Stopwatch();
       System.out.println(ThreeSum.count(a));
       double time = stopwatch.elapsedTime();
       
       System.out.println("elapsed time " + time);
    }
}
