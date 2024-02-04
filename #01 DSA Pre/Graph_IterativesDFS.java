import java.util.ArrayList;
import java.util.Stack;

public class Graph_IterativesDFS {

  public static void addEdge(ArrayList<ArrayList<Integer>> adj, int srcNode, int destNode){
    adj.get(srcNode).add(destNode);
    adj.get(destNode).add(srcNode);
  }

  public static void dfs(ArrayList<ArrayList<Integer>> adj, int noVerti, int src){
    ArrayList<Boolean> vis = new ArrayList<Boolean>();
    for(int i=0;i<noVerti;i++){
      vis.add(false); // No visit has occurred yet
    }
    for(int i=0;i<noVerti;i++){
      if (!vis.get(i)) {
        System.out.println("\nNew Component -> ");
        dfsTraverse(adj, i, vis);
      }
    }
  }
  // DFS traversal method
  public static void dfsTraverse(ArrayList<ArrayList<Integer>> adj,int src,ArrayList<Boolean> vis){
    Stack<Integer> st = new Stack<>();
    st.push(src);
    while (!st.isEmpty()) {
      src = st.peek();
      st.pop();
      if (vis.get(src) == false) {
        System.out.print(src + " ");
        vis.set(src,true);
      }
      ArrayList<Integer> itr = adj.get(src);
      int itrSize = itr.size();
      for(int i=0;i<itrSize;i++){
        if (!vis.get(itr.get(i))) {
          st.push(itr.get(i));
        }
      }
    }
  }



  public static void main(String[] args) {
    int n = 5;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<Integer>());
    }
    addEdge(adj, 1, 0);
    addEdge(adj, 2, 1);
    addEdge(adj, 3, 4);
    addEdge(adj, 2, 4); // comment - 3 or 4 ka connet dekhega 

    dfs(adj, 5, 0);
  }
}
