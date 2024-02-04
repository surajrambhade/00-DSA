class LinkedListNode<T> {
  T data;
  LinkedListNode<T> next;

  public LinkedListNode(T data) {
    this.data = data;
  }
}

public class Rem_Dup {

  public static LinkedListNode<Integer> rem_Dup_Ele(LinkedListNode<Integer> head) {

    if (head == null || head.next == null)
      return head;

    LinkedListNode<Integer> curr,temp;
    curr=head;
    while (curr!=null) {
      temp=curr.next;
      LinkedListNode<Integer> prev= curr;
      while (temp!=null) {
        if (curr.data.equals(temp.data)) {
          prev.next=temp.next;
          temp=prev.next;
        }else{
          prev=temp;
          temp=temp.next;
        }
      }
      curr=curr.next;
    }
    return head;
  }

  public static void printLinkedList(LinkedListNode<Integer> head){
    while (head!=null) {
      System.out.print(head.data + " ");
      head=head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    LinkedListNode<Integer> node=new LinkedListNode<Integer>(2);
    node.next = new LinkedListNode<Integer>(3);
    node.next.next = new LinkedListNode<Integer>(4);
    node.next.next.next = new LinkedListNode<Integer>(2);
    node.next.next.next.next = new LinkedListNode<Integer>(2);

    printLinkedList(node);

    rem_Dup_Ele(node);

    printLinkedList(node);
  }
}