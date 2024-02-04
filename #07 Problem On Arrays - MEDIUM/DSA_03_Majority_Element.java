//https://www.codingninjas.com/studio/problems/majority-element_6783241?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DSA_03_Majority_Element {
  // Butter approch TC- O(N*N)
  public static int majorityElement(int[] arr) {

    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int cnt = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] == arr[i]) {
          cnt++;
        }
      }
      if (cnt > n / 2) {
        return arr[i];
      }
    }
    return -1;
  }

  // Better approch
  public static int majorityElement1(int[] v) {

    // size of the given array:
    int n = v.length;

    // declaring a map:
    HashMap<Integer, Integer> mpp = new HashMap<>();

    // storing the elements with its occurnce:
    for (int i = 0; i < n; i++) {
      int value = mpp.getOrDefault(v[i], 0);
      mpp.put(v[i], value + 1);
    }

    // searching for the majority element:
    for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
      if (it.getValue() > (n / 2)) {
        return it.getKey();
      }
    }
    return -1;
  }

  // optimize
  public static int majorityElement2(int[] arr) {
    int candidate = -1; // Initialize candidate as no majority element
    int count = 0; // Initialize count of the current candidate

    // Apply Boyer-Moore Majority Vote algorithm
    for (int num : arr) {
      if (count == 0) {
        candidate = num;
        count = 1;
      } else if (num == candidate) {
        count++;
      } else {
        count--;
      }
    }

    // Validate if the candidate is a majority element
    count = 0;
    for (int num : arr) {
      if (num == candidate) {
        count++;
      }
    }

    return count > arr.length / 2 ? candidate : -1;
  }

  // optimize
  public static int majorityElement3(int[] arr) {

    int cnt = 0;
    int el = 0;

    // Apply Boyer-Moore Majority Vote algorithm
    for (int i = 0; i < arr.length; i++) {
      if (cnt == 0) {
        cnt = 1;
        el = arr[i];
      } else if (arr[i] == el) {
        cnt++;
      } else {
        cnt--;
      }
    }

    // Validate if the candidate is a majority element
    int cnt1 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == el) {
        cnt1++;
      }
      if (cnt1 > (arr.length / 2)) {
        return el;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
    int result = majorityElement1(arr);
    System.out.println("Majority Element: " + result);
  }
}
