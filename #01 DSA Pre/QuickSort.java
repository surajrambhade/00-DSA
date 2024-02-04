/* 
1.Choose a Pivot:
Choose an element from the array to serve as the pivot. 

2.Partition the Array:
Rearrange the elements in the array such that elements smaller than 
the pivot are on the left,and elements greater than the pivot are on the right.

3.Recursively Apply Quick Sort:
Apply the Quick Sort algorithm recursively to the sub-arrays on the left and right 
of the pivot until the base case is reached (sub-array with one element).

4.Base Case:
If the sub-array has one element or is empty, it is already sorted, and no further 
action is needed.

5.Combine Sorted Sub-arrays:
As the recursive calls return, combine the sorted sub-arrays to get the final sorted array.
*/

public class QuickSort {

  private static void quickSort(int[] input) {
    quickSort(input, 0, input.length-1);
  }

  private static void quickSort(int[] input,int startIndex, int endIndex ) {
    if (startIndex >= endIndex) {
      return;
    }
    int partitionIndex = partition(input,startIndex,endIndex);
    // Recursively Apply Quick Sort
    quickSort(input, startIndex, partitionIndex-1);
    quickSort(input, partitionIndex+1, endIndex);

  }
  private static int partition(int[] input, int startIndex, int endIndex) {

    // Choose a Pivot
    int pivot = input[startIndex];
    int count = 0;
    for(int i=startIndex +1 ;i<=endIndex; i++){
      if (input[i] <= pivot) {
        count++;
      }
    }
    int pivotIndex = startIndex + count;
    input[startIndex] = input[pivotIndex];
    input[pivotIndex] = pivot;

    int i = startIndex, j = endIndex;
    while (i<j) {
      // Partition the Array
      while (i<=endIndex && input[i] <= pivot) {
        i++;
      }

      while (input[j] > pivot) {
        j--;
      }
      if (i<=j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        i++;
        j--;
      }
    }
    return pivotIndex;     
  }

  public static void main(String[] args) {

    int[] arr = { 1, 5, 3, 2, 8, 7, 6, 4 };
    quickSort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }

  }
}
