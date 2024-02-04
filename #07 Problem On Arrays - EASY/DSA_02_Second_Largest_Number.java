
public class DSA_02_Second_Largest_Number {

  public static int[] getSecondOrderElements(int[] arr, int n) {

    int largest = Integer.MIN_VALUE;
    int secLargest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      // Check if the current element is greater than the current largest
      if (arr[i] > largest) {
        secLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secLargest && arr[i] < largest) {
        // If the current element is greater than the current second largest
        // and less than the largest, update the second largest
        secLargest = arr[i];
      }
    }
    return new int[] { largest, secLargest };
  }

  public static void main(String[] args) {
    int[] array = { 10, 5, 8, 20, 2 };
    int n = array.length;
    int[] result = getSecondOrderElements(array, n);

    System.out.println("The largest element is: " + result[0]);
    System.out.println("The second largest element is: " + result[1]);

  }
}
