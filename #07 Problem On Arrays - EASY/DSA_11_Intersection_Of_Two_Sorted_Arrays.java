//https://www.codingninjas.com/studio/problems/intersection-of-2-arrays_1082149?interviewProblemRedirection=true

import java.util.ArrayList;
import java.util.List;

public class DSA_11_Intersection_Of_Two_Sorted_Arrays {
  public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
      int m) {

    ArrayList<Integer> ans = new ArrayList<Integer>();
    int[] vis = new int[m]; // Initialize the visited array for arr2

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr1.get(i).equals(arr2.get(j)) && vis[j] == 0) {
          ans.add(arr1.get(i)); // Add common element to the result
          vis[j] = 1; // Mark the element in arr2 as visited
          break;
        }
        if (arr2.get(j) > arr1.get(i)) {
          break; // If current element in arr2 is greater than current element in arr1, no need
                 // to check further
        }
      }
    }
    return ans;
  }

  // this will work if arr is sorted
  public static ArrayList<Integer> findArrayIntersection1(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
      int m) {

    ArrayList<Integer> ans = new ArrayList<Integer>();
    int i = 0;
    int j = 0;
    while (i < n && j < m) {
      if (arr1.get(i) < arr2.get(j)) {
        i++;
      } else if (arr2.get(j) < arr1.get(i)) {
        j++;
      } else {
        ans.add(arr1.get(i));
        i++;
        j++;
      }

    }
    return ans;
  }

  public static void main(String[] args) {

    ArrayList<Integer> arr1 = new ArrayList<>(List.of(2, 4, 6, 8, 10));
    ArrayList<Integer> arr2 = new ArrayList<>(List.of(4, 8, 12));

    ArrayList<Integer> result = findArrayIntersection1(arr1, arr1.size(), arr2, arr2.size());

    System.out.println("Intersection: " + result);

  }
}
