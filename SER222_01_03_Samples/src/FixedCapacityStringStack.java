/**
 * A simple stack implementation that is limited to storing a fixed number of
 * strings.
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 */
public class FixedCapacityStringStack {  //RA: stack interface assumes generics - cannot implement.
   private String[] data;
   private int n = 0;
   
   public FixedCapacityStringStack (int cap) {
       data = new String[cap];
   } 
   
   public boolean isEmpty() {
       return n == 0;
   }
   
   public void push(String item) {
       data[n++] = item;
   }
   
   public String pop() {
       return data[--n];
   }
}
