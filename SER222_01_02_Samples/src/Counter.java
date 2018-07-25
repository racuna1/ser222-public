/**
 * Represents a counter which starts at zero and may be increased by one.
 * 
 * @author Sedgewick and Wayne, Acuna
 * @version 1.0
 */
public class Counter {
//public class Counter implements IncrementCounter {
    private final String name;     // counter name
    private int count = 0;         // current value

    public Counter(String id) {
        name = id;
    } 
    
    public void increment() {
        count++;
    } 
    
    public int tally() {
        return count;
    } 

    public String toString() {
        return count + " " + name;
    } 
}
