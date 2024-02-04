import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Post - LRN

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.data = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.data = val;
    this.left = left;
    this.right = right;
  }
}

public class BinaryPostOrder {

  // Through Stack - LRN - Revers - NLR
  public static void printPostOrders(TreeNode root, List<Integer> temp) {

    if (root == null) {
      return;
    }
    Stack<TreeNode> st = new Stack<>();
    st.push(root);
    while (st.size() > 0) {
      TreeNode top = st.pop();
      // System.out.println(top.data);
      temp.add(top.data);
      if (top.left != null) {
        st.push(top.left);
      }
      if (top.right != null) {
        st.push(top.right);
      }
    }
    Collections.reverse(temp);
  }

  public static List<Integer> getPostOrderTraversals(TreeNode root) {
    List<Integer> temp = new ArrayList<>();
    printPostOrders(root, temp);
    return temp;
  }

////////////---------------------------------------------------------/////////////////
  public static void printPostOrder(TreeNode root, List<Integer> temp) {
    if (root == null) {
      return;
    }
    printPostOrder(root.left, temp);
    printPostOrder(root.right, temp);
    temp.add(root.data);
  }

  public static List<Integer> getPostOrderTraversal(TreeNode root) {
    List<Integer> temp = new ArrayList<>();
    printPostOrder(root, temp);
    return temp;
  }

  public static void main(String[] args) {
    // Create a sample binary tree
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    // Call the getPostOrder method
    List<Integer> result = getPostOrderTraversal(root);

    // Print the result
    System.out.println("Postorder Traversal: " + result);

  }
}
