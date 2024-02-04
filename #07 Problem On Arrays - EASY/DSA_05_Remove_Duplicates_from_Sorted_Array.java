public class DSA_05_Remove_Duplicates_from_Sorted_Array {

  public static int removeDuplicates(int[] arr, int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int j = 0;
    for (int i = 1; i < n; i++) {
      // If the current element is different from the previous distinct element
      if (arr[i] != arr[j]) {
        j++;
        arr[j] = arr[i]; // Update the next distinct element
      }
    }

    return j + 1; // The size of the array after removing duplicates
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4, 5 };
    int n = arr.length;

    System.out.println("Original Array:");
    printArray(arr, n);

    int newSize = removeDuplicates(arr, n);

    System.out.println("Array after removing duplicates:");
    printArray(arr, newSize);
  }

  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
