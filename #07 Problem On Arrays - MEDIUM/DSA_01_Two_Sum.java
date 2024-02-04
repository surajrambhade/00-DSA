
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class DSA_01_Two_Sum {
  // brute tc - n*n
  public static String read(int n, int[] book, int target) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }
        if (book[i] + book[j] == target) {
          return "Yes";
        }
      }
    }
    return "No";
  }

  // but still having n*n tc - but lesser then above
  public static String read1(int n, int[] book, int target) {

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {

        if (book[i] + book[j] == target) {
          return "YES";
        }
      }
    }
    return "NO";
  }

  // Optimize
  public static String read2(int n, int[] book, int target) {

    HashSet<Integer> seenNumber = new HashSet<>();

    for (int i = 0; i < n; i++) {
      int a = book[i];
      int more = target - a;
      if (seenNumber.contains(more)) {
        return "YES";
      }
      seenNumber.add(a);
    }
    return "NO";

  }

  // by hashmap
  public static String read3(int n, int[] book, int target) {
    HashMap<Integer, Integer> seenNumber = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int a = book[i];
      int more = target - a;

      if (seenNumber.containsKey(more)) {
        return "YES";
        // return new int[]{seenNumber.get(more), i};
      }

      seenNumber.put(a, i);
    }

    return "NO";
    // return new int[]{-1, -1};
  }

  // TC - O(n) + O(nlogn)
  public static String read4(int n, int[] book, int target) {

    // Initialize two pointers at the beginning and end of the sorted array
    int left = 0;
    int right = n - 1;

    // Sort the array in ascending order
    Arrays.sort(book);

    // Perform a two-pointer search
    while (left < right) {
        // Calculate the sum of elements at the left and right pointers
        int sum = book[left] + book[right];

        // Check if the sum equals the target
        if (sum == target) {
            return "YES"; // Return "YES" if a pair is found
        } else if (sum < target) {
            // If the sum is less than the target, move the left pointer to the right
            left++;
        } else {
            // If the sum is greater than the target, move the right pointer to the left
            right--;
        }
    }

    // If the while loop completes without finding a pair, return "NO"
    return "NO";
  }

  public static void main(String[] args) {
    int[] array = { 2, 7, 11, 15 };
    int target = 9;

    String result = read4(array.length, array, target);
    System.out.println(result); // Output: YES
  }
}
