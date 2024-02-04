//https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_06_Left_Rotate_an_Array_by_One {

  static int[] rotateArray(int[] arr, int n) {

    int temp = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n - 1] = temp;

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;

    System.out.println("Original Array:");
    printArray(arr);

    rotateArray(arr, n);

    System.out.println("Array after rotating by one position:");
    printArray(arr);
  }

  // Helper method to print the array
  static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }
}
