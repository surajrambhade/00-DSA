import java.util.Arrays;

/**
 * Merge_Sort
 * The mergeSort method recursively divides the array into halves,
 * and the merge method merges the sorted halves.
 * Finally, the main method initializes an array,
 * calls the mergeSort function, and prints the sorted array.
 * # Step In Merge Sort
 * E.g - 1 5 3 2 8 7 6 4 - Array
 * 1 - Divide ( From the above e.g, Array needs to divide into equal part and
 * the process
 * goes count. untill one element left in one Array. )
 * 2 - Conquer
 * 3 - Merge ( In last we need to compare each array and sort one by one, and
 * finally merge all arrays)
 * ----------------------------------------------------------------
 * 1.Base Case - if (arr.lenght<=1){return arr}
 * 2.REcursive call
 * 3.Small Calculation - Merge the sort arrays
 */

public class MergeSort {

  public static int[] merge_Sort(int[] input) {
    // Array is already sorted if it has 0 or 1 element
    if (input.length <= 1) {
      return input;
    }
    int i = (input.length) / 2;
    // Copy data to temporary arrays leftArray[] and rightArray[]
    // Recursive calls to divide the array into halves
    int[] left = merge_Sort(Arrays.copyOfRange(input, 0, i));
    // Copy data to temporary arrays leftArray[] and rightArray[]
    // Recursive calls to divide the array into halves
    int[] right = merge_Sort(Arrays.copyOfRange(input, i, input.length));

    return merge(left, right);
  }

  public static int[] merge(int[] left, int[] right) {

    int i = 0;
    int j = 0;
    int newarr[] = new int[left.length + right.length];
    int k = 0;

    while (i < left.length && j < right.length) {
      // Compare elements from leftArray and rightArray and merge them into array

      if (left[i] < right[j]) {
        newarr[k] = left[i];
        i++;
        k++;
      } else {
        newarr[k] = right[j];
        k++;
        j++;
      }
    }
    // Copy remaining elements of leftArray, if any
    while (i < left.length) {
      newarr[k] = left[i];
      k++;
      i++;
    }
    // Copy remaining elements of rightArray, if any
    while (j < right.length) {
      newarr[k] = right[j];
      k++;
      j++;
    }
    return newarr;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 5, 3, 2, 8, 7, 6, 4 };
    int[] newarr = merge_Sort(arr);
    for (int i : newarr) {
      System.out.print(i + " ");
    }
  }
}