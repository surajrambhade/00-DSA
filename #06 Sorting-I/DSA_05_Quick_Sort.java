//https://www.codingninjas.com/studio/problems/quick-sort_5844?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_05_Quick_Sort {

  // Quick Sort method
  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      // Get the partition index
      int pIndex = partition(arr, low, high);

      // Recursively sort the elements before and after the partition index
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
    }
  }

  // Partition method to find the correct position of the pivot element
  private static int partition(int[] arr, int low, int high) {
    // Choose the pivot element (in this case, the element at the low index)
    int pivot = arr[low];
    int i = low;
    int j = high;

    // Continue partitioning until the indices meet
    while (i < j) {
      // Move i to the right as long as elements are less than or equal to the pivot
      while (i <= high && arr[i] <= pivot) {
        i++;
      }

      // Move j to the left as long as elements are greater than the pivot
      while (j >= low + 1 && arr[j] > pivot) {
        j--;
      }

      // Swap elements at i and j if i is still less than j
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // Swap the pivot with the element at index j to place it in its correct position
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    // Return the partition index
    return j;
  }

  // Main method for testing
  public static void main(String[] args) {
    int[] array = { 64, 25, 12, 22, 11 };
    int n = array.length;

    // Print Original Array
    System.out.println("Original Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }

    // Call Quick Sort
    quickSort(array, 0, n - 1);

    // Print Sorted Array
    System.out.println("\nSorted Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }
  }
}
