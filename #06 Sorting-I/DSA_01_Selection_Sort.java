//https://www.codingninjas.com/studio/problems/selection-sort_624469?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_01_Selection_Sort {

  public static void selectionSort(int[] arr, int n) {

    int len = arr.length;
    n=len;
    for (int i = 0; i < len - 1; i++) {
      int minIndex = i;
      for (int j = i+1; j < len; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;

    }
  }

  public static void main(String[] args) {
    int[] array = { 64, 25, 12, 22, 11 };
    int n = array.length;

    System.out.println("Original Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }

    selectionSort(array, n);

    System.out.println("\nSorted Array:");
    for (int value : array) {
      System.out.print(value + " ");
    }
  }

}