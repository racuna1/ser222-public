import java.util.NoSuchElementException;

/**
 * Interface to define priority queue.
 * 
 * @author Sedgewick and Wayne, Acuna
 * @version 1.0
 * @param <Key> Generic type for queue to contain. Must implement Comparable.
 */
public interface MaxPriorityQueue<Key extends Comparable<Key>> {   
    
    /**
     * Adds an element.
     * 
     * @param value value to insert
     */
    public void insert(Key value);
    
    /**
     * Returns the maximum element.
     * 
     * @return maximum element
     * @throws NoSuchElementException 
     */
    public Key max() throws NoSuchElementException;
    
    /**
     * Returns and removes the maximum element.
     * 
     * @return
     * @throws NoSuchElementException 
     */
    public Key delMax() throws NoSuchElementException;
    
    /**
     * Checks if the PQ is empty.
     * 
     * @return 
     */
    public boolean isEmpty();
    
    /**
     * Number of elements in the PQ.
     * 
     * @return size
     */
    public int size();
}