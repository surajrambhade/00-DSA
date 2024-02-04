// Node class definition
    class Node {
        public int data;
        public Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }



public class Reverse_Linked_List {
    // Function to reverse a linked list
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        /*
          Node head = null;
          Node tail = null;

          for (int i = 1; i <= 5; i++) {
              Node newNode = new Node(i);
              if (head == null) {
                  head = newNode;
                  tail = newNode;
              } else {
                  tail.next = newNode;
                  tail = newNode;
              }
          }
          */

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Call the reverseLinkedList function
        head = reverseLinkedList(head);

        // Print the linked list after reversal
        System.out.println("\nLinked List after reversal:");
        printLinkedList(head);
    }

    // Utility function to print the linked list
    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    
}
