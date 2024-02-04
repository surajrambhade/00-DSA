import java.io.*;
import java.util.*;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Delete_Node {
    // Function to delete a node from a linked list given only that node
    public static void deleteNode(LinkedListNode<Integer> node) {
        // Check if the given node is null or the last node in the list
        LinkedListNode<Integer> temp = (node == null) ? node : (node.next);

        // Copy the data of the next node to the current node
        node.data = temp.data;

        // Update the next pointer of the current node to skip the next node
        node.next = (temp == null) ? null : (temp.next);

        // Set the reference of the next node to null (delete the next node)
        temp = null;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        head.next = new LinkedListNode<>(2);
        head.next.next = new LinkedListNode<>(3);
        head.next.next.next = new LinkedListNode<>(4);
        head.next.next.next.next = new LinkedListNode<>(5);
        /*
         
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        LinkedListNode<Integer> current = head;

        int[] values = {2, 3, 4, 5};

        for (int value : values) {
        current.next = new LinkedListNode<>(value);
        current = current.next;
        }

         */

        // Choose a node to delete (let's say the node with data 3)
        LinkedListNode<Integer> nodeToDelete = head.next.next;

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Call the deleteNode function
        deleteNode(nodeToDelete);

        // Print the linked list after deletion
        System.out.println("\nLinked List after deleting node with data 3:");
        printLinkedList(head);
    }

    // Utility function to print the linked list
    private static void printLinkedList(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
/*
 
1.Initialization:

We have a linked list with nodes: 1 -> 2 -> 3 -> 4 -> 5.
We want to delete the node with data 3.
deleteNode Function Call:
The function is called with nodeToDelete as the node with data 3.

2.Inside the function:

temp is set to the next node of nodeToDelete, which is the node with data 4.
The data of nodeToDelete (3) is replaced with the data of temp (4).
The next pointer of nodeToDelete is set to the next pointer of temp, skipping the node with data 4.
The reference to temp is set to null (deleting the node with data 4).
 */