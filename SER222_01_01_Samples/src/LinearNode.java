/**
 * Represents a node in a singly linked list.
 * 
 * @author Lewis et al., Acuna
 * @version 4.0
 * @param <Item> contained type
 */
public class LinearNode<Item> {
    private LinearNode<Item> next;
    private Item element;
 
    /**
     * Creates a node storing the specified element.
     * @param elem element to be stored
     */
    public LinearNode(Item elem) {
        next = null;
        element = elem;
    }

    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public LinearNode<Item> getNext() {
        return next;
    }
 
    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(LinearNode<Item> node) {
        next = node;
    }
 
    /**
     * Returns the element stored in this node.
     * @return element stored at the node
     */
    public Item getElement() {
        return element;
    }
 
    /**
     * Sets the element stored in this node.
     * @param elem element to be stored at this node
     */
    public void setElement(Item elem) {
        element = elem;
    }
}