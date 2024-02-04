public class Revers_Doubly_Linked_list {
    public static void main(String[] args) {
        // Create a sample doubly linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        // Print the original doubly linked list
        System.out.println("Original Doubly Linked List:");
        printDLL(head);

        // Call the reverseDLL function
        head = reverseDLL(head);

        // Print the reversed doubly linked list
        System.out.println("\nReversed Doubly Linked List:");
        printDLL(head);
    }

    // Node class definition
    static class Node {
        public int data;
        public Node next;
        public Node prev;

        Node() {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = next;
        }
    }

    // Function to reverse a doubly linked list
    public static Node reverseDLL(Node head) {
        Node h = null;
        while (head != null) {
            Node temp = head.next;
            head.next = head.prev;
            head.prev = temp;
            h = head;
            head = temp;
        }
        return h;
    }

    // Utility function to print a doubly linked list
    private static void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
