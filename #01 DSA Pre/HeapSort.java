/* Heap Sort has a time complexity of O(n log n).

1.Build a Max-Heap:
Start by building a max-heap from the given array. A max-heap is a binary 
tree where each parent node has a value greater than or equal to its children.

2.Heapify:
For each non-leaf node in the max-heap, ensure that the subtree rooted at 
that node is also a max-heap. This process is called heapify.

3.Extract Maximum Element:
Swap the root of the max-heap (which is the maximum element) with the last 
element of the array. Reduce the size of the heap by one.

4.Heapify Again:
After extracting the maximum element, heapify the reduced heap to maintain 
the max-heap property.

5.Repeat Steps 3-4:
Repeat the process of extracting the maximum element and heapifying until 
the entire array is sorted.

 */
public class HeapSort {

  // Heap Sort Function
  private static void heap_Sort(int[] arr) {
    // Build Max-Heap
    for (int i = 0; i < arr.length; i++) {
      upheapify(arr, i);
    }

    // Extract Maximum Element and Heapify
    for (int i = 0; i < arr.length; i++) {
      downheapify(arr, arr.length - 1 - i);
    }
  }

  // Downheapify Function
  private static void downheapify(int[] arr, int e) {
    // Step 2.1: Swap Root with Last Element
    int top = arr[0];
    arr[0] = arr[e];
    arr[e] = top;

    // Initialize Parent and Child Indices
    int parent = 0;
    int child1 = (2 * parent) + 1;
    int child2 = (2 * parent) + 2;

    // Heapify the Reduced Heap
    while (child1 < e || child2 < e) {
      int minIndex = parent;

      // Compare with Left Child
      if (child1 < e && arr[child1] < arr[minIndex]) {
        minIndex = child1;
      }

      // Compare with Right Child
      if (child2 < e && arr[child2] < arr[minIndex]) {
        minIndex = child2;
      }

      // Check if Parent is the Minimum Element
      if (minIndex == parent) {
        return; // Exit if the heap property is satisfied
      } else {
        // Swap Elements and Update Indices
        int temp = arr[minIndex];
        arr[minIndex] = arr[parent];
        arr[parent] = temp;
      }

      // Update Indices for Next Iteration
      parent = minIndex;
      child1 = (2 * parent) + 1;
      child2 = (2 * parent) + 2;
    }
  }

  // Upheapify Function
  private static void upheapify(int[] arr, int i) {
    // Calculate Parent Index
    int parent = (i - 1) / 2;

    // Maintain Heap Property by Swapping
    while (i > 0 && arr[i] < arr[parent]) {
      int temp = arr[parent];
      arr[parent] = arr[i];
      arr[i] = temp;

      // Update Indices for Next Iteration
      i = parent;
      parent = (i - 1) / 2;
    }
  }

  public static void main(String[] args) {
    // Input Array
    int[] arr = { 1, 5, 3, 2, 8, 7, 6, 4 };

    // Call Heap Sort Function
    heap_Sort(arr);

    // Print Sorted Array
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
