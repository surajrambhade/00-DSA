public class DSA_05_Longest_Subarray_With_Sum_K {

  public static int longestSubarrayWithSumK(int[] a, long k) {
    int left = 0;      // Left pointer of the sliding window
    int right = 0;     // Right pointer of the sliding window
    int maxLen = 0;     // Variable to store the maximum length of subarray with sum k
    long sum = a[0];    // Variable to store the current sum of elements in the window
    int n = a.length;   // Length of the array

    while (right < n) {
      // Move the left pointer until the sum is greater than k
      while (left <= right && sum > k) {
        sum -= a[left];
        left++;
      }

      // Check if the current subarray has the desired sum
      if (sum == k) {
        maxLen = Math.max(maxLen, right - left + 1);
      }

      right++;  // Move the right pointer to expand the window

      // If the right pointer is within bounds, update the sum
      if (right < n) {
        sum += a[right];
      }
    }

    return maxLen;
  }

  public static void main(String[] args) {
    // You can test the function with sample inputs in the main method
    int[] arr = {1, 2, 3, 4, 5};
    long targetSum = 9;
    int result = longestSubarrayWithSumK(arr, targetSum);
    System.out.println("Length of the longest subarray with sum " + targetSum + ": " + result);
  }
}
