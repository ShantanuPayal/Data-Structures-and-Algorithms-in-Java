package LinkedList;

import java.util.Scanner;

class CDNode {
    int data; // Data stored in the node
    CDNode next; // Reference to the next node
    CDNode prev; // Reference to the previous node

    CDNode(int data) { // Constructor to initialize node with data
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CircularDoublyLinkedList {
    CDNode root; // Reference to the root node of the linked list

    CircularDoublyLinkedList() { // Constructor to initialize the linked list
        this.root = null; // Initialize the root to null (empty list)
    }
    void insertAtStart(int data) {
        CDNode newNode = new CDNode(data); // Create a new node with the given data
        if (root == null) { // Check if the list is empty
            root = newNode; // If empty, make the new node the root
            newNode.next = root; // Circular reference: next of the new node points to root
            newNode.prev = root; // Previous of the new node also points to root
        } else {
            CDNode temp = root.prev; // Get the last node (previous of root) as temp
            newNode.next = root; // Set the next of the new node to root
            root.prev = newNode; // Update root's previous to point to the new node
            newNode.prev = temp; // Set the previous of the new node to temp
            temp.next = newNode; // Make temp's next point to the new node
            root = newNode; // Make the new node the new root
        }
        System.out.println("Inserted " + data + " at the beginning");
    }

    void deleteFromStart() {
        if (root == null) { // Check if the list is empty
            System.out.println("List is empty"); // Display message if the list is empty
            return;
        }
        if (root.next == root) { // Check if there's only one node in the list
            root = null; // If yes, set root to null (empty list)
            return;
        }
        CDNode temp = root.prev; // Get the last node (previous of root) as temp
        temp.next = root.next; // Set temp's next to root's next
        root.next.prev = temp; // Update the previous of root's next to temp
        root = root.next; // Move root to the next node
        System.out.println("Deleted from the beginning");
    }

    void insertAtEnd(int data) { // Method to insert a node at the end of the list
        CDNode newNode = new CDNode(data); // Create a new node with the given data
        if (root == null) { // Check if the list is empty
            root = newNode; // If empty, make the new node the root
            newNode.next = root; // Circular reference: next of the new node points to root
            newNode.prev = root; // Previous of the new node also points to root
        } else {
            CDNode temp = root.prev; // Get the last node (previous of root) as temp
            temp.next = newNode; // Make temp's next point to the new node
            newNode.prev = temp; // Set the previous of the new node to temp
            newNode.next = root; // Set the next of the new node to root
            root.prev = newNode; // Update root's previous to point to the new node
        }
        System.out.println("Inserted " + data + " at the end");
    }

    void deleteFromEnd() { // Method to delete a node from the end of the list
        if (root == null) { // Check if the list is empty
            System.out.println("List is empty"); // Display message if the list is empty
            return;
        }
        if (root.next == root) { // Check if there's only one node in the list
            root = null; // If yes, set root to null (empty list)
            return;
        }
        CDNode temp = root.prev; // Get the last node (previous of root) as temp
        temp.prev.next = root; // Update the second last node's next to point to root
        root.prev = temp.prev; // Update root's previous to point to the second last node
        System.out.println("Deleted " + temp.data + " from the end");
    }

    void displayList() { // Method to display the elements of the list
        if (root == null) { // Check if the list is empty
            System.out.println("List is empty"); // Display message if the list is empty
            return;
        }
        CDNode temp = root; // Start traversal from the root node
        do {
            System.out.print(temp.data + " <-> "); // Display current node's data
            temp = temp.next; // Move to the next node
        } while (temp != root); // Continue until back to the root node
        System.out.println(); // Move to the next line after displaying the list
    }

    

    void search(int data) {
        if (root == null) { // Check if the list is empty
            System.out.println("List is empty"); // Display message if the list is empty
            return;
        }
        CDNode temp = root; // Start traversal from the root node
        int pos = 1; // Position counter for displaying the node position
        boolean found = false; // Flag to indicate if the data is found
        do {
            if (temp.data == data) { // If current node's data matches the search data
                System.out.println(data + " found at position " + pos); // Display the position
                found = true; // Update flag
                break; // Exit the loop
            }
            temp = temp.next; // Move to the next node
            pos++; // Increment position counter
        } while (temp != root); // Continue until back to the root node

        if (!found) { // If data is not found
            System.out.println(data + " not found in the list"); // Display message
        }
    }


 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CircularDoublyLinkedList list = new CircularDoublyLinkedList();
            int choice;
            do {
                System.out.println("\nCircular Doubly Linked List Operations:");
                System.out.println("1. Insert at the beginning");
                System.out.println("2. Delete from the beginning");
                System.out.println("3. Search for an element");
                System.out.println("4. Display the list");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert at the beginning: ");
                        int data = scanner.nextInt();
                        list.insertAtStart(data);
                        break;
                    case 2:
                        list.deleteFromStart();
                        break;
                    case 3:
                        System.out.print("Enter data to search: ");
                        int searchData = scanner.nextInt();
                        list.search(searchData);
                        break;
                    case 4:
                        System.out.println("Circular Doubly Linked List:");
                        list.displayList();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            } while (choice != 5);
            scanner.close();
        
    }

}
