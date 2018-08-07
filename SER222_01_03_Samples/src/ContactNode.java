/**
 * A node to hold personal details.
 * 
 * @author Acuna
 * @author Cheng
 * @version 1.0
 */
  public class ContactNode {
    private String name; 
    private int phone;
    private String email;
    private ContactNode next;

    ContactNode() {
        name = "";
        phone = 0;
        email = "";
        next = null;
    }

    ContactNode(String n, int p, String e) {
        name = n;
        phone = p;
        email = e;
        next = null;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public int getPhone() {
        return phone;
    }
    
    public void setPhone(int p) {
        phone = p;
    }
    
    public String getEmail() { 
        return email;
    }
    
    public void setEmail(String e) {
        email = e;
    }
    
    public void setNext(ContactNode n) {
        next = n;
    }
    
    public ContactNode getNext() {
        return next;
    }
    
    public String toString() {
        return name + ": " + phone + ", " + email;
    }
  }