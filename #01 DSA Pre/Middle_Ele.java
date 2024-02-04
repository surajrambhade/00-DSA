 class  Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

public class Middle_Ele {

   public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node slow= head;
        Node fast= head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
    return slow;
    }
  public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(12);

        // Call the findMiddle method
        Node middle = findMiddle(head);

        // Print the result
        if (middle != null) {
            System.out.println("Middle element: " + middle.data);
        } else {
            System.out.println("List is empty");
        }
  }
}
