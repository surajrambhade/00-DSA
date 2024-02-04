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

class Pair<T, U> {
  T minimum;
  U maximum;

  public Pair(T minimum, U maximum) {
    this.minimum = minimum;
    this.maximum = maximum;
  }
}

public class Binary_Min_Max {

  public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
    if (root == null) {
      Pair<Integer, Integer> p = new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
      return p;
    }
    Pair<Integer, Integer> left = getMinAndMax(root.left);
    Pair<Integer, Integer> right = getMinAndMax(root.right);

    int minimum = Math.min(root.data, Math.min(left.minimum, right.minimum));
    int maximum = Math.max(root.data, Math.max(left.maximum, right.maximum));
    Pair<Integer, Integer> p = new Pair<Integer, Integer>(minimum, maximum);
    return p;
  }

  // -----------------By Noraml way without extra class ------------------------//
  public static int findMinimum(BinaryTreeNode<Integer> root) {
    if (root == null) {
      return Integer.MAX_VALUE;
    }

    return Math.min(root.data, Math.min(findMinimum(root.left), findMinimum(root.right)));
  }

  public static int findMaximum(BinaryTreeNode<Integer> root) {
    if (root == null) {
      return Integer.MIN_VALUE;
    }

    return Math.max(root.data, Math.max(findMaximum(root.left), findMaximum(root.right)));
  }

  public static void main(String[] args) {
    // Example binary tree creation
    // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
    // root.left = new BinaryTreeNode<>(5);
    // root.right = new BinaryTreeNode<>(20);
    // root.left.left = new BinaryTreeNode<>(3);
    // root.left.right = new BinaryTreeNode<>(7);
    // root.right.left = new BinaryTreeNode<>(15);
    // root.right.right = new BinaryTreeNode<>(25);

    // Pair<Integer, Integer> result = getMinAndMax(root);

    // System.out.println("Minimum value: " + result.minimum);
    // System.out.println("Maximum value: " + result.maximum);

    // -----------------By Noraml way without extra class ------------------------//  

    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
    root.left = new BinaryTreeNode<>(5);
    root.right = new BinaryTreeNode<>(20);
    root.left.left = new BinaryTreeNode<>(3);
    root.left.right = new BinaryTreeNode<>(7);
    root.right.left = new BinaryTreeNode<>(15);
    root.right.right = new BinaryTreeNode<>(25);

    int minimum = findMinimum(root);
    int maximum = findMaximum(root);

    System.out.println("Minimum value: " + minimum);
    System.out.println("Maximum value: " + maximum);
  }
}
