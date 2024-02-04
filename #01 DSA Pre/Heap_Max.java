
// Esmai hum down toh top aate hai root element check krte.
// Heap mai right wala element upar jata hai.
// TC - 0(n) , SC - 0(1) 

public class Heap_Max {

  // Function to build a max heap
  static void buildHeap(int[] arr, int n) {
    // Start from the last non-leaf node and heapify each node
    int lastNonLeafIndex = (n / 2) - 1;
    for (int i = lastNonLeafIndex; i >= 0; i--) {
      heapify(arr, n, i);
    }
  }

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
    if (largest != i) { // parent element smaller the its children
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;
      heapify(arr, n, largest);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 5, 3, 7, 9, 4, 2 };
    int n = arr.length;

    // Build max heap
    buildHeap(arr, n);

    // Print Max Heap
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
/*

public class Heap_Min {

  // Function to build a min heap
  static void buildHeap(int[] arr, int n) {
    // Start from the last non-leaf node and heapify each node
    int lastNonLeafIndex = (n / 2) - 1;
    for (int i = lastNonLeafIndex; i >= 0; i--) {
      heapify(arr, n, i);
    }
  }

  // Function to heapify a subtree rooted at node i
  static void heapify(int[] arr, int n, int i) {
    // Initialize smallest as the root
    int smallest = i;
    int left = 2 * i + 1; // Left child
    int right = 2 * i + 2; // Right child

    // If left child is smaller than root
    if (left < n && arr[left] < arr[smallest]) { // left index smaller than n i.e length of the arr
      smallest = left;
    }

    // If right child is smaller than smallest so far
    if (right < n && arr[right] < arr[smallest]) {
      smallest = right;
    }

    // If smallest is not the root, swap and heapify the affected sub-tree
    if (smallest != i) { // parent element larger than its children
      int swap = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = swap;
      heapify(arr, n, smallest);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 5, 3, 7, 9, 4, 2 };
    int n = arr.length;

    // Build min heap
    buildHeap(arr, n);

    // Print Min Heap
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

 */