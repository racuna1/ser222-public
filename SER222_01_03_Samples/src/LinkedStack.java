import java.util.NoSuchElementException;

/**
 * A simple stack implementation. Uses list as internal representation. All 
 * operations are O(1).
 * 
 * @author Acuna
 * @version 1.0
 */
public class LinkedStack<ItemType> implements Stack<ItemType> {

     private LinearNode<ItemType> top;
     private int n = 0;
    
     public LinkedStack() {
        top = null;
     }
    
    public boolean isEmpty() {
       return top == null;
    }
    
    @Override
    public void push(ItemType item) {
        LinearNode<ItemType> node = new LinearNode<>(item);
        node.setNext(top);
        top = node;
        n++;
    }
    
    public ItemType peek() {
        if(isEmpty())
            throw new NoSuchElementException();
        
        return top.getElement();
    }
    
    public ItemType pop() {
        if(isEmpty())
         throw new NoSuchElementException();
        
       ItemType element = top.getElement();
       top = top.getNext();
       n--;
       
       return element;
    }
    
    public int size() {
        return n;
    }
}