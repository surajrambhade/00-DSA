import java.util.HashMap;
import java.util.Map;

public class DSA_14_Longest_Subarray_With_Sum_K {

  // Better Approch
  public static int longestSubarrayWithSumK(int[] a, long k) {
    Map<Long, Integer> preSumHashMap = new HashMap<>();
    long sum = 0;
    int maxLen = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];

      // If the current prefix sum equals k, update maxLen
      if (sum == k) {
        maxLen = Math.max(maxLen, i + 1);
      }

      // Calculate the remainder to find a subarray with sum k
      long rem = sum - k;

      // If the remainder exists in the prefix sum map, update maxLen
      if (preSumHashMap.containsKey(rem)) {
        int len = i - preSumHashMap.get(rem);
        maxLen = Math.max(maxLen, len);
      }

      // If the current prefix sum is not in the map, add it
      if (!preSumHashMap.containsKey(sum)) {
        preSumHashMap.put(sum, i);
      }
    }
    return maxLen;
  }

  // Optimize approch 
  public static int longestSubarrayWithSumK1(int[] a, long k) {
    int left = 0;
    int right = 0;
    int maxLen = 0;
    long sum = a[0];
    int n = a.length;

    while (right < n) {
      // Move the left pointer until the sum is less than or equal to k
      while (left <= right && sum > k) {
        sum -= a[left];
        left++;
      }

      // Check if the current subarray has the desired sum
      if (sum == k) {
        maxLen = Math.max(maxLen, right - left + 1);
      }
      right++;
      // If the right pointer is within bounds, update the sum
      if (right < n) {
        sum += a[right];
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    int[] array = { 10, 5, 2, 7, 1, 9 };
    long k = 15;

    System.out.println(longestSubarrayWithSumK1(array, k)); // Output: 4
  }
}


// Better Approch - Dry Run 
/*

  Let's dry run the code with the array [10, 5, 2, 7, 1, 9] and k = 15:

  Initialization:

  a = [10, 5, 2, 7, 1, 9]
  k = 15
  preSumHashMap = {}
  sum = 0
  maxLen = 0
  Iteration 1 (i = 0):

  sum += a[0] -> sum = 10
  sum != k, no update
  preSumHashMap = {10: 0}
  Iteration 2 (i = 1):

  sum += a[1] -> sum = 15
  sum == k, update maxLen = 2
  preSumHashMap = {10: 0, 15: 1}
  Iteration 3 (i = 2):

  sum += a[2] -> sum = 17
  sum != k, no update
  rem = 17 - 15 = 2, preSumHashMap contains 2, update maxLen = 2
  Iteration 4 (i = 3):

  sum += a[3] -> sum = 24
  sum != k, no update
  rem = 24 - 15 = 9, preSumHashMap does not contain 9
  Iteration 5 (i = 4):

  sum += a[4] -> sum = 25
  sum != k, no update
  rem = 25 - 15 = 10, preSumHashMap does not contain 10
  Iteration 6 (i = 5):

  sum += a[5] -> sum = 34
  sum != k, no update
  rem = 34 - 15 = 19, preSumHashMap does not contain 19
  Final Result:

  maxLen = 4 (from subarray [5, 2, 7, 1])
  The code successfully finds the length of the longest subarray with the sum equal to k.


 */