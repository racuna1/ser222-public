import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * A simple stack implementation. Uses array as internal representation.
 * 
 * @author Sedgewick and Wayne
 * @author Acuna
 * @version 1.0
 * @param <Item> item type
 */
public class ArrayStack<Item> implements Stack<Item> {
   private Item[] data;
   private int n = 0;
   private final static int CAPACITY = 100;
   
   public ArrayStack() {
       this(CAPACITY);
   } 
   public ArrayStack(int cap) {
       data = (Item[]) new Object[cap];
   } 
   
   @Override
   public boolean isEmpty() {
       return n == 0;
   }
   
   @Override
   public void push(Item item) {
       if(data.length == n)
           resize();
       data[n++] = item;
   }
   
   @Override
   public Item pop() {
       if(isEmpty())
           throw new NoSuchElementException();
       
       return data[--n];
   }
   
   @Override
   public Item peek() {
       if(isEmpty())
           throw new NoSuchElementException();
       
       return data[n-1];
   }

   private void resize() {
       data = Arrays.copyOf(data, data.length * 2);   
   }
   
   @Override
   public int size() {
       return n;
   }
}