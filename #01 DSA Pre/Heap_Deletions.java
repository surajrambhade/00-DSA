// 1. Pick out the root element.
// 2. Put last element tree in root.
// 3. Heapify root itself.
// Heap mai right wala element upar jata hai.
// TC - 0(log2n) , SC - 0(1) 
public class Heap_Deletions {

  // Function to heapify a subtree rooted at node i
  static void heapify(int[] arr, int n, int i) {
    // Initialize largest as the root
    int largest = i;
    int left = 2 * i + 1; // Left child
    int right = 2 * i + 2; // Right child

    // If left child is larger than root
    if (left < n && arr[left] > arr[largest]) { // left index small then n i.e lenght of the arr
      largest = left;
    }

    // If right child is larger than largest so far
    if (right < n && arr[right] > arr[largest]) {
      largest = right;
    }

    // If largest is not the root, swap and heapify the affected sub-tree
    if (largest != i) {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;
      heapify(arr, n, largest);
    }
  }

  static int deleteNode(int[] arr, int n) {
    if (n == 0) {
      System.out.println("Heap is empty.");
      return -1; // Assuming -1 represents an invalid value
    }

    int deletedValue = arr[0];
    arr[0] = arr[n - 1];
    n = n - 1;
    heapify(arr, n, 0);
    return deletedValue;

    // int lastEleIndx = arr[n - 1];
    // int temp = arr[0];
    // arr[0] = lastEleIndx;
    // lastEleIndx = temp;
    // n = n - 1;
    // heapify(arr, n, 0);
    // return lastEleIndx;
  }

  // Function to build a max heap niche se upar
  static void buildHeap(int[] arr, int n) {
    // Start from the last non-leaf node and heapify each node
    int lastNonLeafIndex = (n / 2) - 1;
    for (int i = lastNonLeafIndex; i >= 0; i--) {
      heapify(arr, n, i);
    }
  }

  // Heap sort
  public static void sort(int[] arr, int n) {
    for (int i = n - 1; i > 0; i--) {
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, i, 0);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 5, 3, 7, 9, 4, 2 };
    int n = arr.length;
    System.out.println("First Array");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\n" + "Max Heap: ");
    buildHeap(arr, n);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\nDeleted Node: " + deleteNode(arr, n));
    System.out.print("Second Array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
    System.out.print("Sort Array: ");
    sort(arr, n);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
