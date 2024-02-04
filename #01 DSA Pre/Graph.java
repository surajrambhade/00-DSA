import java.util.ArrayList;

public class Graph {

  // Function to add an edge to the adjacency list
  static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
    adj.get(src).add(dest);
    adj.get(dest).add(src);
  }

  public static void main(String[] args) {
    int n = 4;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

    // Initialize the adjacency list
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<Integer>());
    }

    // Adding edges to the graph
    addEdge(adj, 0, 1);
    addEdge(adj, 0, 2);
    addEdge(adj, 1, 2);
    addEdge(adj, 1, 3);

    // Displaying the adjacency list
    for (int i = 0; i < n; i++) {
      System.out.println("Adjacency List of the particular Node:- " + i);
      for (int j = 0; j < adj.get(i).size(); j++) {
        System.out.print("-> " + adj.get(i).get(j));
      }
      System.out.println();
    }
  }
}


