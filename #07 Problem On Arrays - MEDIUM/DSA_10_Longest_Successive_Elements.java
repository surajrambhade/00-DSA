//https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DSA_10_Longest_Successive_Elements {

  // Brute TC -O(N^3)
  public static int longestSuccessiveElements(int[] a) {

    int n = a.length;
    int longest = 1;
    for (int i = 0; i < n; i++) {
      int x = a[i];
      int cnt = 1;
      while (linearSearch(a, x + 1) == true) {
        x += 1;
        cnt++;
      }
      longest = Math.max(longest, cnt);
    }
    return longest;
  }

  private static boolean linearSearch(int[] a, int num) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
      if (a[i] == num) {
        return true;
      }
    }
    return false;
  }

  // better
  public static int longestSuccessiveElements1(int[] a) {
    Arrays.sort(a);
    int n = a.length;
    if (n == 0)
      return 0;
    int lastSmaller = Integer.MIN_VALUE;
    int cnt = 0;
    int longest = 1;

    for (int i = 0; i < n; i++) {
      if (a[i] - 1 == lastSmaller) {
        cnt++;
        lastSmaller = a[i];
      } else if (lastSmaller != a[i]) {
        cnt = 1;
        lastSmaller = a[i];
      }
      longest = Math.max(longest, cnt);

    }
    return longest;

  }

  // Optimiz
  public static int longestSuccessiveElements2(int[] a) {

    int n = a.length;
    if (n == 0) {
      return 0;
    }
    int longest = 1;

    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < n; i++) {
      set.add(a[i]);
    }

    for (int it : set) {
      // if 'it' is a starting number
      if (!set.contains(it - 1)) {
        // find consecutive numbers
        int cnt = 1;
        int x = it;
        while (set.contains(x + 1)) {
          x = x + 1;
          cnt = cnt + 1;
        }
        longest = Math.max(longest, cnt);
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    int[] a = { 15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3 };
    int ans = longestSuccessiveElements2(a);
    System.out.println("The longest consecutive sequence is " + ans);
  }
}
