import java.util.LinkedList;
import java.util.Queue;

class TreeNode<T> {
  T data;
  TreeNode<T> left;
  TreeNode<T> right;

  public TreeNode() {
    this.data = null;
    this.left = null;
    this.right = null;
  }

  public TreeNode(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class Binary_Insert_Node {
  public static TreeNode<Integer> insertNodeBinaryTree(TreeNode<Integer> root, int val) {

    if (root == null) {
      root = new TreeNode<Integer>(val);
      return root;
    }
    Queue<TreeNode<Integer>> q = new LinkedList<>();
    TreeNode<Integer> temp = root;
    q.add(temp);
    while (!q.isEmpty()) {
      TreeNode<Integer> front = q.remove();
      if (front.left == null) {
        front.left = new TreeNode<Integer>(val);
        break; // Inserted, exit the loop
      }
      if (front.right == null) {
        front.right = new TreeNode<Integer>(val);
        break; // Inserted, exit the loop
      }
      q.add(front.left);
      q.add(front.right);
    }
    return root;
  }

  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(1);
    root.left = new TreeNode<>(2);
    root.right = new TreeNode<>(3);

    System.out.println("Original Tree:");
    printTree(root);

    int newValue = 4;
    root = insertNodeBinaryTree(root, newValue);

    System.out.println("\nTree after inserting " + newValue + ":");
    printTree(root);
  }

  // Helper method to print the tree (in-order traversal)
  private static void printTree(TreeNode<Integer> root) {
    if (root != null) {
      printTree(root.left);
      System.out.print(root.data + " ");
      printTree(root.right);
    }
  }
}
