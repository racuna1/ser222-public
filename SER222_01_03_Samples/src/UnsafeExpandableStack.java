import java.util.Arrays;

/**
 * A simple stack implementation. Does not include "finishing touches".
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 * @param <Item> item type
 */
public class UnsafeExpandableStack<Item> {
   private Item[] data;
   private int n = 0;
   
   public UnsafeExpandableStack(int cap) {
       data = (Item[]) new Object[cap];
   } 
   
   public boolean isEmpty() {
       return n == 0;
   }
   
   public void push(Item item) {
       if(data.length == n)
           resize();
       data[n++] = item;
   }
   
   public Item pop() {
       return data[--n];
   }

   private void resize() {
       data = Arrays.copyOf(data, data.length * 2);   
   }
}