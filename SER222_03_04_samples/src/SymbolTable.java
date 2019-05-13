/**
 * Symbol table interface.
 * 
 * @author Sedgewick and Wayne, Acuna
 * @param <Key> search key
 * @param <Value> return type
 */
public interface SymbolTable<Key, Value> {
    // put key-value pair into the table
    void put(Key key, Value val);
    
    //get value paired with key
    Value get(Key key);
    
    //remove key (and its value) from table
    void delete(Key key);
    
    //is there a value paired with key?
    boolean contains(Key key);
    
    //is the table empty?
    boolean isEmpty();
    
    //number of key-value pairs
    int size();
    
    //all keys in the table
    Iterable<Key> keys();
}
