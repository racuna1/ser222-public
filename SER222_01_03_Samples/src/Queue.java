import java.util.NoSuchElementException;

/**
 * A simple queue interface.
 * 
 * @author Sedgewick
 * @author Wayne
 * @author Acuna
 * @version 1.0
 */
public interface Queue<Item> {
    
    /**
     * Add an item.
     * @param item an item
     */
    public void enqueue(Item item);
    
    /**
     * Remove the least recently added item.
     * @return an item
     */
    public Item dequeue() throws NoSuchElementException;
    
    /**
     * Return, but do not remove, the most least added item.
     * @return an item
     */
    public Item front() throws NoSuchElementException;
    
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