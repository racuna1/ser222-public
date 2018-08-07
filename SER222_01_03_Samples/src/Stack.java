
import java.util.NoSuchElementException;

/**
 * A simple stack interface.
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 */
public interface Stack<Item> {
    
    /**
     * Add an item.
     * @param item an item
     */
    public void push(Item item);
    
    /**
     * Remove the most recently added item.
     * @return an item
     */
    public Item pop() throws NoSuchElementException;
    
    /**
     * Return, but do not remove, the most recently added item.
     * @return an item
     */
    public Item peek() throws NoSuchElementException;
    
    /**
     * Is the queue empty?
     * @return if empty
     */
    public boolean isEmpty();
    
    /**
     * Number of items in the queue.
     * @return number of items
     */
    public int size();
}