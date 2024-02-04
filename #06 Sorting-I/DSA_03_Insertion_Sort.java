//https://www.codingninjas.com/studio/problems/insertion-sort_624381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_03_Insertion_Sort {

  public static void insertion_sort(int arr[], int n) {
    for (int i = 0; i <= n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
  }

  public static void insertionSort(int arr[], int n) {
    for (int i = 0; i <= n - 1; i++) {
      int key = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1] > key) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = key;
    }
  }

  // By Rec
  public static void insertion_sort1(int arr[], int i, int n) {

    if (i == n)
      return;
    int j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
      int temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      j--;
    }

    insertion_sort1(arr, i + 1, n);
  }

  public static void main(String[] args) {
    int[] array = { 64, 25, 12, 22, 11 };
    int n = array.length;

    System.out.println("Original Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }

    insertion_sort1(array, 0,n);

    System.out.println("\nSorted Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }
  }
}
