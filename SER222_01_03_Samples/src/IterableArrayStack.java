import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simple stack implementation. Includes "finishing touches" and iterable
 * support.
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 * @param <Item> item type
 */
public class IterableArrayStack<Item> implements Stack<Item>, Iterable<Item> {
   private Item[] data;
   private int n = 0;
   private final static int CAPACITY = 100;
   
   public IterableArrayStack() {
       this(CAPACITY);
   } 
   public IterableArrayStack(int cap) {
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
   
   @Override
   public Iterator<Item> iterator() {
     return new ReverseArrayIterator();
   }
   
   private class ReverseArrayIterator implements Iterator<Item> {
         private int i = n;
         
         @Override
         public boolean hasNext() {
             return i > 0; 
         }
         
         @Override
         public Item next() {
             return data[--i];}
         
         @Override
         public void remove() {}
   }
}