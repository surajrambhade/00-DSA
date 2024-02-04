//https://www.codingninjas.com/studio/problems/maximum-subarray-sum_630526?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.List;

public class DSA_04_Maximum_Subarray_Sum {

  // Brute approch TC - near about n^3
  public static long maxSubarraySum(int[] arr, int n) {
    int maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += arr[k];
        }
        maxi = Math.max(sum, maxi);
      }
    }
    return maxi;
  }

  // better n^2
  public static long maxSubarraySum1(int[] arr, int n) {

    int maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
      }
      maxi = Math.max(sum, maxi);
    }
    return maxi;
  }

  // Opitmize O(n) SC - O(1) KADANCE ALGO 
  public static long maxSubarraySum2(int[] arr, int n) {
    long maxi = 0;
    long sum = 0;

    for (int i = 0; i < n; i++) {
      sum += arr[i];

      if (sum > maxi) {
        // If the current sum is greater than the maximum subarray sum, update the
        // maximum.
        maxi = sum;
      }

      if (sum < 0) {
        // If the current sum becomes negative, reset it to 0 (start a new potential
        // subarray).
        sum = 0;
      }
    }

    if (maxi < 0) {
      // If the final maximum subarray sum is negative, set it to 0.
      maxi = 0;
    }

    return maxi;
  }

  // if we want to take arr of max sun
  public static ArrayList<Integer> maxSubarraySum3(int[] arr, int n) {
    long maxi = 0;
    long sum = 0;
    int currentStart = 0; // Track the starting index of the current subarray
    int ansStart = -1;
    int ansEnd = -1;

    for (int i = 0; i < n; i++) {
      if (sum == 0) {
        currentStart = i;
      }
      sum += arr[i];

     

      if (sum > maxi) {
        maxi = sum;
        ansStart = currentStart;
        ansEnd = i;
      }

      if (sum < 0) {
        sum = 0;
      }
    }

    if (maxi < 0) {
      maxi = 0;
    }

    ArrayList<Integer> subarray = new ArrayList<>();
    if (ansStart != -1) {
      for (int i = ansStart; i <= ansEnd; i++) {
        subarray.add(arr[i]);
      }
    }

    return subarray;
  }

  // Opitmize O(n) SC - O(1)
  public static long maxSubarraySum4(int[] arr, int n) {
    long currentSum = 0;
    long maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      currentSum += arr[i];
      maxSum = Math.max(maxSum, currentSum);

      // If currentSum becomes negative, reset it to 0
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {

    int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int n = arr.length;
    ArrayList<Integer> subarray = maxSubarraySum3(arr, n);
    System.out.println("Subarray with Maximum Sum: " + subarray);

    // =======================================================//

    int[] arr1 = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int n1 = arr.length;
    long subarray1 = maxSubarraySum2(arr1, n1);
    System.out.println("Subarray with Maximum Sum: " + subarray1);
  }
}
