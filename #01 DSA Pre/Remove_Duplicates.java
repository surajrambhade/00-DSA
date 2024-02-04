import java.util.HashMap;

class LinkedListNode<T> {
  T data;
  LinkedListNode<T> next;

  public LinkedListNode(T data) {
    this.data = data;
  }
}

public class Remove_Duplicates {

  public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
    // if (head == null || head.next == null) {
    // return head;
    // }
    // // store the address of head
    // LinkedListNode<Integer> curr, temp;
    // curr = head;
    // while (curr != null) {
    // temp = curr.next;
    // LinkedListNode<Integer> prev = curr; // Store the address of previous node
    // while (temp != null) {
    // // Case When There Is a Duplicate Element
    // if (curr.data.equals(temp.data)) {
    // prev.next = temp.next;
    // temp = prev.next;
    // }
    // // Case When There Is No Duplicate Element
    // else {
    // prev = temp;
    // temp = temp.next;
    // }
    // }
    // curr = curr.next;
    // }
    // Above is normal way to solve the problem but if there is time bound e.g we
    // need to use hashmap.

    if (head == null || head.next == null) {
      return head;
    }
    LinkedListNode<Integer> curr = head;
    // Storing the value
    HashMap<Integer, Boolean> seen = new HashMap<>();

    LinkedListNode<Integer> prev = null;
    while (curr != null) {
      if (seen.containsKey(curr.data)) {
        // Skip the duplicate by updating the links
        prev.next = curr.next;
        curr = prev.next;
      } else {
        // Add the current value to the HashMap and move to the next node
        seen.put(curr.data, true);
        prev = curr;
        curr = curr.next;
      }
    }

    return head;
  }

  // function to print a linked list
  private static void printLinkedList(LinkedListNode<Integer> head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    // Create a sample linked list with duplicates
    LinkedListNode<Integer> head = new LinkedListNode<>(1);
    head.next = new LinkedListNode<>(2);
    head.next.next = new LinkedListNode<>(2);
    head.next.next.next = new LinkedListNode<>(3);
    head.next.next.next.next = new LinkedListNode<>(4);
    head.next.next.next.next.next = new LinkedListNode<>(4);
    head.next.next.next.next.next.next = new LinkedListNode<>(5);

    // Print the original linked list
    System.out.println("Original Linked List:");
    printLinkedList(head);

    // Call the removeDuplicates function
    head = removeDuplicates(head);

    // Print the linked list after removing duplicates
    System.out.println("\nLinked List after Removing Duplicates:");
    printLinkedList(head);

  }
}
