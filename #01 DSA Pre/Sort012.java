
public class Sort012 {
  public static void Zero_one_two(int arr[], int arr_size) {
    int low = 0;
    int high = arr_size - 1;
    int mid = 0, temp = 0;
    while (mid <= high) {
      switch (arr[mid]) {
        case 0:
          temp = arr[low];
          arr[low] = arr[mid];
          arr[mid] = temp;
          low++;
          mid++;
          break;
        case 1:
          mid++;
          break;
        case 2:
          temp = arr[mid];
          arr[mid] = arr[high];
          high--;
      }

    }
  }
  public static void Zero_one_two1(int arr[], int arr_size) {
    int low = 0;
    int high = arr_size - 1;
    int mid = 0, temp = 0;

    while (mid <= high) {
      // If the current element is 0
      if (arr[mid] == 0) {
        // Swap arr[low] and arr[mid]
        temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        // If the current element is 1, move to the next element
        mid++;
      } else {
        // If the current element is 2
        // Swap arr[mid] and arr[high], and move towards the lower end
        temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }
  }
  // Helper method to print the array
  private static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 1, 2, 0, 1, 0, 2 };
    int n = arr.length;
    System.out.println("Original Array:");
    printArray(arr);
    // Sort the array
    Zero_one_two(arr, n);
    System.out.println("\nArray after sorting 0s, 1s, and 2s:");
    printArray(arr);
  }
}
/*
 * 
 * while (mid <= high) {
 * // If the current element is 0
 * if (arr[mid] == 0) {
 * // Swap arr[low] and arr[mid]
 * temp = arr[low];
 * arr[low] = arr[mid];
 * arr[mid] = temp;
 * low++;
 * mid++;
 * } else if (arr[mid] == 1) {
 * // If the current element is 1, move to the next element
 * mid++;
 * } else {
 * // If the current element is 2
 * // Swap arr[mid] and arr[high], and move towards the lower end
 * temp = arr[mid];
 * arr[mid] = arr[high];
 * arr[high] = temp;
 * high--;
 * }
 */