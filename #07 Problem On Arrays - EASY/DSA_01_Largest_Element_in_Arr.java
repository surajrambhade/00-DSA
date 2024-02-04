//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_01_Largest_Element_in_Arr {

  static int largestElement(int[] arr, int n) {
  
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      // Check if the current element is greater than the current largest
      if (arr[i] > largest) {
        // If true, update the largest variable
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int[] array = {10, 5, 8, 20, 2};
    int n = array.length;

    int result = largestElement(array, n);
    System.out.println("The largest element in the array is: " + result);
  }
}
