/**
 * Represents a node in a singly linked list.
 * 
 * @author Lewis
 * @author Chase
 * @author Acuna
 * @version 4.0
 */
public class LinearNode<T> {
    private LinearNode<T> next;
    private T element;
 
    public LinearNode() {
        next = null;
        element = null;
    }
 
    public LinearNode(T elem) {
        next = null;
        element = elem;
    }
 
    public LinearNode<T> getNext() {
        return next;
    }
 
    public void setNext(LinearNode<T> node) {
        next = node;
    }
 
    public T getElement() {
        return element;
    }
 
    public void setElement(T elem) {
        element = elem;
    }
}