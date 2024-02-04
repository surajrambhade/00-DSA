//https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DSA_10_Merge_2_Sorted_Array {
  // If array is not sort || Burt approch
  public static List<Integer> sortedArray(int[] a, int[] b) {

    int n1 = a.length;
    int n2 = b.length;

    Set<Integer> set = new HashSet<Integer>();
    List<Integer> mergeList = new ArrayList<Integer>();
    for (int i = 0; i < n1; i++) {
      set.add(a[i]);
    }
    for (int i = 0; i < n2; i++) {
      set.add(b[i]);
    }
    for (int value : set) {
      mergeList.add(value);
    }

    return mergeList;
  }

  // optimize approch
  public static List<Integer> sortedArray1(int[] a, int[] b) {

    int n1 = a.length;
    int n2 = b.length;
    int i = 0;
    int j = 0;
    List<Integer> mergeList = new ArrayList<Integer>();

    while (i < n1 && j < n2) {
      if (a[i] <= b[j]) {
        if (mergeList.size() == 0 || !mergeList.contains(a[i])) {
          mergeList.add(a[i]);
        }
        i++;
      } else {
        if (mergeList.size() == 0 || !mergeList.contains(b[j])) {
          mergeList.add(b[j]);
        }
        j++;
      }
    }
    while (j < n2) {
      if (mergeList.size() == 0 || !mergeList.contains(b[j])) {
        mergeList.add(b[j]);
      }
      j++;
    }

    while (i < n1) {
      if (mergeList.size() == 0 || !mergeList.contains(a[i])) {
        mergeList.add(a[i]);
      }
      i++;
    }
    return mergeList;
  }

  public static void main(String[] args) {
    int[] array1 = { 1, 2, 4, 5, 7 };
    int[] array2 = { 2, 5, 7, 8 };

    List<Integer> result = sortedArray1(array1, array2);

    System.out.println("Merged and Sorted Array: " + result);
  }
}
