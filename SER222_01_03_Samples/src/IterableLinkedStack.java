import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simple stack implementation with support for iterators.. Uses list as
 * internal representation. All operations are O(1).
 * 
 * @author Acuna
 * @version 1.0
 */
public class IterableLinkedStack<ItemType> implements Stack<ItemType>, Iterable {

     private LinearNode<ItemType> top;
     private int n = 0;
     private int modCount = 0;
    
     public IterableLinkedStack() {
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
        modCount++;
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
       modCount++;
       
       return element;
    }
    
    public int size() {
        return n;
    }
    
    public Iterator iterator() {
        return new StackIterator();
    }
    
    private class StackIterator implements Iterator<ItemType> {
        private final int modCounted = modCount;
        private LinearNode<ItemType> iter = top;
        
        public boolean hasNext() {
            return iter != null;
        }

        public ItemType next() {
            if (!hasNext())
                    throw new NoSuchElementException();
            
            if(modCount != modCounted)
                throw new ConcurrentModificationException();
            
            ItemType element = iter.getElement();
            iter = iter.getNext();
            
            return element;
        }
        
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }       
    }
}