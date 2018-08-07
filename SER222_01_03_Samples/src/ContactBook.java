import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * A program that stores contact information in a singly linked list.
 * 
 * @author Acuna
 * @author Cheng
 * @version 1.0
 */
public class ContactBook {
    private static ContactNode head = null;
    private static Scanner scan = new Scanner(System.in);
    
    //print menu for selection
    public static void main(String [] args) {
        String choice = "";
        
        do {
            System.out.println("Enter your selection\n");
            System.out.println("\ti: insert a new entry\n");
            System.out.println("\td: delete an entry\n");
            System.out.println("\ts: search an entry\n");
            System.out.println("\tp: print all entries\n");
            System.out.println("\tq: quit \n");
            choice = scan.nextLine();
            branching(choice);
        } while (!choice.toLowerCase().equals("q"));
    }
    
    // branch to different tasks
    private static void branching(String choice) {
        try {
            String name;
            
            switch (choice)  {
                case "i":
                    insert();
                    break;
                case "s":
                    System.out.println("please enter the name to be searched for:\n");
                    name = scan.nextLine();
                    searchContact(name);
                    break;
                case "d":
                    deleteContact();
                    break;
                case "p":
                    printAll(head); 
                    break;
                default:
                    System.out.println("Invalid input\n");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Invalid user.");
        }
    }

    //display all contacts
    private static void printAll(ContactNode node) {
        ContactNode iter = node;
        
        while(iter != null) {
            System.out.println(iter);
            iter = iter.getNext();
        }
    }
    
    // insert a new entry
    private static void insert() {
        ContactNode contact = new ContactNode();

        System.out.println("Enter name, phone, and email:");

        contact.setName(scan.nextLine());
        contact.setPhone(scan.nextInt());
        scan.nextLine(); //remove \n
        contact.setEmail(scan.nextLine());

        contact.setNext(head); // inserting at the beginning
        head = contact;
    }

    private static ContactNode searchContact(String targetName) {
        ContactNode iter = head, prev = head;

        while (iter != null)
            if (targetName.equals(iter.getName())) {
                return prev;
            }
            else {
                prev = iter; iter = iter.getNext();
            }

        System.out.println("The name does not exist.");
        throw new NoSuchElementException();
    }
    private static void deleteContact() {
        String targetName;
        ContactNode prev;
        
        System.out.println("Enter the name to search for:");
        targetName = scan.nextLine();
        prev = searchContact(targetName); // find the position using search function

        if (prev == head && targetName.equals(prev.getName())) { // deleting at head
            head = head.getNext();
        }
        else { // deleting an arbitrary node
            prev.setNext(prev.getNext().getNext());
        }
    }
}