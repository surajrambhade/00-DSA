//https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.HashMap;
import java.util.Map;

public class DSA_14_Coun_All_Subarrays_With_Given_Sum {
  // Brute
  public static int findAllSubarraysWithGivenSum(int arr[], int k) {
    int n = arr.length; // size of the given array.
    int cnt = 0; // Number of subarrays:

    for (int i = 0; i < n; i++) { // starting index i
      for (int j = i; j < n; j++) { // ending index j

        // calculate the sum of subarray [i...j]
        int sum = 0;
        for (int K = i; K <= j; K++)
          sum += arr[K];

        // Increase the count if sum == k:
        if (sum == k)
          cnt++;
      }
    }
    return cnt;
  }

  // Better
  public static int findAllSubarraysWithGivenSum1(int arr[], int k) {
    int n = arr.length; // size of the given array.
    int cnt = 0; // Number of subarrays:

    for (int i = 0; i < n; i++) { // starting index i
      int sum = 0;
      for (int j = i; j < n; j++) { // ending index j
        // calculate the sum of subarray [i...j]
        sum += arr[j];
        // Increase the count if sum == k:
        if (sum == k)
          cnt++;
      }
    }
    return cnt;
  }

  //Optimize  TC- O(NlogN) sc -O(N)
  public static int findAllSubarraysWithGivenSum2(int arr[], int k) {
    int n = arr.length; // size of the given array.;
    Map<Integer, Integer> mpp = new HashMap<>();
    int preSum = 0, cnt = 0;

    mpp.put(0, 1); // Setting 0 in the map.
    for (int i = 0; i < n; i++) {
        // add current element to prefix Sum:
        preSum += arr[i];

        // Calculate x-k:
        int remove = preSum - k;

        // Add the number of subarrays to be removed:
        cnt += mpp.getOrDefault(remove, 0);

        // Update the count of prefix sum
        // in the map.
        mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
    }
    return cnt;

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4,4, 5 };
    int k = 8;

    int result = findAllSubarraysWithGivenSum2(arr, k);

    System.out.println("Number of subarrays with sum " + k + ": " + result);
  }
}
