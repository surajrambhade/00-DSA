import java.util.Scanner;

/*
 
Im this i have write 1.Print 2.Add 3.Delete specifice position 4.Find Largest Element

 */
public class Doubly_Linked_List {

  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
      data = d;
      next = null;
      prev = null;
    }

  }

  private static void print(Node head) {
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
  }

  private static Node add(Node head, int data, int position) {

    Node newNode = new Node(data);
    Node h = head;
    if (position == 0) {
      newNode.next = head;
      head.prev = newNode;
      return newNode;
    } else {
      while (position > 1) {
        head = head.next;
        position--;
      }
      if (head.next == null) {
        head.next = newNode;
        newNode.prev = head;
        return h;
      } else {
        Node temp = head.next;
        head.next = newNode;
        newNode.next = temp;
        temp.prev = newNode;
        return h;
      }
    }
  }

  private static Node delete(Node head, int position) {
    Node h = head;
    if (position == 0) {
      head = head.next;
      head.prev = null;
      return head;
    } else {
      while (position != 0) {
        head = head.next;
        position--;
      }
      head.prev.next = head.next;
      head.next.prev = head.prev;
      return h;
    }
  }

  private static int largest(Node head) {
    int large = 0;
    while (head != null) {
      if (head.data > large) {
        large = head.data;
      }
      head = head.next;
    }

    return large;
  }

  public static void main(String[] args) {

    Scanner y = new Scanner(System.in);
    System.out.print("Enter the no. of element you are to add: ");
    int n = y.nextInt();
    Node head = null, tail = null;
    while (n > 0) {
      int num = y.nextInt();
      Node newNode = new Node(num);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
      }
      n--;
    }
    // print(head);
    // head= add(head,88,3);
    // print(head);
    // head = delete(head,3);
    // print(head);

    int large = largest(head);
    System.out.println( "Largest Element: "+ large);

  }

}
