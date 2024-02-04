//https://www.codingninjas.com/studio/problems/bubble-sort_624380?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


public class DSA_02_Bubble_Sort {

  public static void bubbleSort(int[] arr, int n) {
    boolean swapped = false;
    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void bubble_sort1(int arr[], int n) {
    boolean swapped = false;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  // By rec

  public static void bubbleSort2(int[] arr, int n) {
    boolean swapped = false;
    if (n ==1) {
      return;
    }
      for (int j = 0; j <= n - 2; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
        if (!swapped) {
          break;
        }
      }
      
    bubbleSort2(arr, n-1);
  }

  public static void main(String[] args) {
    int[] array = { 64, 25, 12, 22, 11 };
    int n = array.length;

    System.out.println("Original Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }

    bubbleSort2(array, n);

    System.out.println("\nSorted Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }
  }
}
