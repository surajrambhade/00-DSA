import java.util.LinkedList;
import java.util.Queue;

public class MiddleElementQueue {

  public static void middleElementQueue(Queue<Integer> q) {
    if (q.size() == 0) {
      int size = q.size() / 2 - 1;
      for (int i = 0; i < size; i++) {
        q.remove();
      }
      System.out.print(q.peek() + " ");
    } else {
      int size = q.size() / 2;
      for(int i =0;i<size;i++){
        q.remove();
      }
      System.out.print(q.peek()+ " ");
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(4);
    q.add(2);
    q.add(9);
    q.add(5);
    q.add(3);

    System.out.print("Middle Element: ");
    middleElementQueue(q);

  }
}