public class SimpleLinkedList {
    
    // The head is the starting point of our list
    Node head;

    // 1. Define the Node structure
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // 2. Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Otherwise, travel to the last node
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            // Point the last node to our new node
            last.next = newNode;
        }
    }

    // 3. Method to print the list
    public void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // --- Main Method to Run the Code ---
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}
