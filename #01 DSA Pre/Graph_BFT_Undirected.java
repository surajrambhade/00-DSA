import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFT_Undirected {
  public static void main(String[] args) {
    Boolean matrix[][] = {
        // 0 1 2 3 4 5 - > same niche
        { false, true, true, false, true, false }, // 0
        { true, false, false, false, false, true }, // 1
        { true, false, false, false, true, false }, // 2
        { false, false, false, false, true, true }, // 3
        { true, false, true, true, false, false }, // 4
        { false, true, false, true, false, false } // 5
    };

    ArrayList<Integer> a = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>(); // Linkedlist esiliya inteface hai
    q.add(0);
    while (!q.isEmpty()) {
      Queue<Integer> child = new LinkedList<>();
      while (q.size() != 0) {
        int x = q.poll();
        a.add(x);
        for (int i = 0; i < 6; i++) { // Matrix 6 ka hai
          if (matrix[x][i] == true) {
            child.add(i);
            matrix[x][i] = false;
            matrix[i][x] = false;
            for (int j = 0; j < 6; j++) {
              matrix[j][i] = false;
            }
          }
        }
      }
      q = child;
    }
    for (int i = 0; i < a.size(); i++) {
      System.out.print(a.get(i) + " ");
    }
  }
}
