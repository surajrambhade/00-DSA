
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

public class BinaryTree {

  static int indx = 0;
  static BinaryTreeNode<Integer> takeInput(int arr[]) {
    if (indx == arr.length) {
      return null;
    }
    if (arr[indx] == -1) {   // -1 Means node k niche value nhi hai 
      indx++;
      return null;
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[indx]);
    indx++;
    root.left = takeInput(arr);
    root.right = takeInput(arr);
    return root;
  }

  public static void preOrder(BinaryTreeNode<Integer> root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 12, 5, -1, -1, 6, -1, -1, 9, -1, -1 };

    BinaryTreeNode<Integer> root1 = takeInput(arr);
    System.out.println(root1.left.right.data);

    // Creating a sample binary tree
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
    root.left = new BinaryTreeNode<>(2);
    root.right = new BinaryTreeNode<>(3);
    root.left.left = new BinaryTreeNode<>(4);
    root.left.right = new BinaryTreeNode<>(5);
    root.right.left = new BinaryTreeNode<>(6);
    root.right.right = new BinaryTreeNode<>(7);

    // Calling the preOrder function
    System.out.println("Pre-order traversal:");
    preOrder(root);

    /*
     * BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(3);
     * System.out.println(root.left);
     * System.out.println(root.left == null);
     * root.left = new BinaryTreeNode(12);
     * root.left.right = new BinaryTreeNode(6);
     * System.out.println(root.left.data);
     * System.out.println(root.left.right.data);
     */
  }
}
