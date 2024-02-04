import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

  public static void reverse(Queue<Integer> q) {
    if (q.size() == 1) {
      return;
    }
    int x = q.peek();
    q.remove();
    reverse(q);
    q.add(x);
    return;
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(18);
    q.add(32);
    q.add(11);
    q.add(13);
    q.add(12);
    q.add(1);

    reverse(q);

    int n = q.size();
    for (int i = 0; i < n; i++) {
      System.out.print(q.peek() + " ");
      q.remove();
    }

  }
}
