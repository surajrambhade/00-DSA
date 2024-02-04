import java.util.ArrayList;
import java.util.Stack;
// Preorder - NLR Normal  recursively , NRL - Stack 
class BinaryTreeNode<T> {
  T data;
  BinaryTreeNode<T> left;
  BinaryTreeNode<T> right;

  public BinaryTreeNode(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
public class BinaryDFS_Stack_PreOrder {

  public static void printOrder(BinaryTreeNode<Integer> root, ArrayList<Integer> temp){
    Stack<BinaryTreeNode<Integer>> st = new Stack<>();

    st.push(root);
    while (st.size()>0) {
      BinaryTreeNode<Integer> top =  st.pop();
     // System.out.println(top.data);
      temp.add(top.data);
      if (top.right!=null) {
        st.push(top.right);
      }
      if (top.left!=null) {
        st.push(top.left);
      }
    }
  }
  public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root){
    ArrayList<Integer> temp = new ArrayList<>();
    printOrder(root, temp);
    return temp;
  }



  public static void main(String[] args) {
    // Create a sample binary tree
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
    root.left = new BinaryTreeNode<>(2);
    root.right = new BinaryTreeNode<>(3);
    root.left.left = new BinaryTreeNode<>(4);
    root.left.right = new BinaryTreeNode<>(5);
    root.right.left = new BinaryTreeNode<>(6);
    root.right.right = new BinaryTreeNode<>(7);

    // Call the preorderTraversal method
    ArrayList<Integer> result = preorderTraversal(root);

    // Print the result
    System.out.println("Preorder Traversal: " + result);
  }
}

/*
     private static void preorder(BinaryTreeNode<Integer> node, ArrayList<Integer> ans) {

        if (node == null) {
            return;
        }       
        // Inserting node's value to ans array.
        ans.add(node.data);
        
        // Traversing left subtree
        preorder(node.left, ans);

        // Traversing right subtree
        preorder(node.right, ans);

    }
    public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
        // Maintain an arrayList
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

 */
