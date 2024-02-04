
//https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DSA_09_Superior_Elements {
  // brute
  public static List<Integer> superiorElements(int[] a) {
    int n = a.length;
    List<Integer> result = new ArrayList<>();
    // Checking whether arr[i] is greater than all
    // the elements in its right side
    for (int i = 0; i < n; i++) {
      boolean leader = true; // Reset leader for each element

      for (int j = i + 1; j < n; j++) {
        if (a[j] >= a[i]) {
          // If any element found is greater than current leader
          // curr element is not the leader.
          leader = false;
          break;
        }
      }

      if (leader) {
        result.add(a[i]);
      }
    }
    Collections.reverse(result);
    return result;
  }

  // Optimize
  public static List<Integer> superiorElements1(int[] a) {
    int n = a.length;
    List<Integer> result = new ArrayList<>();
    int maxi = Integer.MIN_VALUE;

    for (int i = n - 1; i >= 0; i--) {
      // Check if the current element is greater than the current maximum
      if (a[i] > maxi) {
        // Step 3: If yes, add it to the result list
        result.add(a[i]);
      }
      // Update the maximum with the maximum of the current element and the
      // current maximum
      maxi = Math.max(maxi, a[i]);
    }
    Collections.sort(result);
    return result;
  }

  public static void main(String[] args) {
    int[] inputArray = { 16, 17, 4, 3, 5, 2 };
    List<Integer> leaders = superiorElements1(inputArray);

    // Print the result
    System.out.println("Input Array: " + Arrays.toString(inputArray));
    System.out.println("Leaders: " + leaders);
  }
}
