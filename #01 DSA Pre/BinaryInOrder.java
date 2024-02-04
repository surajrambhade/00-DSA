
//LNR  - Recercively

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryInOrder {
  // LNR
  public static void printInOrder(TreeNode root, List<Integer> temp) {
    if (root == null) {
      return;
    }
    printInOrder(root.left, temp);// Left sub tree
    temp.add(root.data);// Root Node 
    printInOrder(root.right, temp);// Right sub tree

  }

  public static List<Integer> getInOrderTraversal(TreeNode root) {
    List<Integer> temp = new ArrayList<>();
    printInOrder(root, temp);
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

    // Call the getInOrderTraversal method
    List<Integer> result = getInOrderTraversal(root);

    // Print the result
    System.out.println("Inorder Traversal: " + result);
  }

  //-----------------------Ittertive approch------------------------//
  public static void printInOrdes(TreeNode root, List<Integer> temp){

    Stack<TreeNode> st = new Stack<>();

    TreeNode curr = root;
    while (curr!=null || st.size()>0) {
      while (curr!=null) {
        st.push(curr);
        curr = curr.left;
      }
      curr=st.pop();
      temp.add(curr.data);
      curr=curr.right;
    }
  }
  public static List<Integer> getInOrderTraversals(TreeNode root){
    List<Integer> temp = new ArrayList<>();
    printInOrdes(root, temp);
    return temp;
  }
}
