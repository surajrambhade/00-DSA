//https://www.codingninjas.com/studio/problems/merge-sort_5846?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

import java.util.ArrayList;

public class DSA_04_Merge_Sort {

    // Merge Sort Function
    public static void merge_sort(int[] arr, int low, int high) {
        // Base case: If low is greater than or equal to high, return.
        if (low >= high) {
            return;
        }

        // Find the middle index.
        int mid = (low + high) / 2;

        // Recursively call merge_sort on the left and right halves of the array.
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);

        // Merge the two sorted halves.
        merge(arr, low, mid, high);
    }

    // Merge Function
    private static void merge(int[] arr, int low, int mid, int high) {
        // Create an ArrayList to temporarily store merged elements.
        ArrayList<Integer> temp = new ArrayList<>();

        // Initialize pointers for the left and right halves.
        int left = low;
        int right = mid + 1;

        // Compare elements from the left and right halves and merge them in sorted order.
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy the remaining elements from the left half.
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy the remaining elements from the right half.
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the merged elements back to the original array.
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Main Method
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11 };
        int n = array.length;

        // Print Original Array
        System.out.println("Original Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Call Merge Sort
        merge_sort(array, 0, n - 1);

        // Print Sorted Array
        System.out.println("\nSorted Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
