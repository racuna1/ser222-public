/**
 * A simple stack implementation that is limited to storing a fixed number of
 * elements.
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 * @param <Item> item type
 */
public class FixedCapacityStack<Item> implements Stack<Item> {
   private Item[] data;
   private int n = 0;
   
   public FixedCapacityStack(int cap) {
       data = (Item[]) new Object[cap];
   } 
   
   @Override
   public boolean isEmpty() {
       return n == 0;
   }
   
   @Override
   public void push(Item item) {
       data[n++] = item;
   }
   
   @Override
   public Item pop() {
       return data[--n];
   }
   
   @Override
   public Item peek() {
       return data[n-1];
   }
   
   @Override
   public int size() {
       return n;
   }
}