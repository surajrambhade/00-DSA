//https://www.codingninjas.com/studio/problems/alternate-numbers_6783445?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DSA_07_Alternate_Numbers {

  // brute - TC - O(2N)
  public static int[] RearrangebySign(int[] arr) {

    int n = arr.length;
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (arr[i] >= 0) {
        pos.add(arr[i]);
      } else {
        neg.add(arr[i]);
      }
    }
    // Arrays.fill(arr, 0);
    for (int i = 0; i < n / 2; i++) {
      arr[2 * i] = pos.get(i);
      arr[2 * i + 1] = neg.get(i);
    }
    return arr;
  }

  // Not affecting much but it is Optmial approch
  public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
    int n = A.size();
    ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
    int posIndex = 0;
    int negIndex = 1;
    for (int i = 0; i < n; i++) {
      if (A.get(i) >= 0) {
        ans.set(posIndex, A.get(i));
        posIndex += 2;
      } else {
        ans.set(negIndex, A.get(i));
        negIndex += 2;
      }

    }
    return ans;
  }

  // Alternate TC - O(2N) and sc- O(N)
  public static int[] RearrangebySign2(int[] arr) {

    int n = arr.length;
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (arr[i] >= 0) {
        pos.add(arr[i]);
      } else {
        neg.add(arr[i]);
      }
    }
    // Arrays.fill(arr, 0);
    if (pos.size() > neg.size()) {
      for (int i = 0; i < neg.size(); i++) {
        arr[2 * i] = pos.get(i);
        arr[2 * i + 1] = neg.get(i);
      }
      int index = neg.size() * 2;
      for (int i = neg.size(); i < pos.size(); i++) {
        arr[index] = pos.get(i);
        index++;
      }
    } else {
      for (int i = 0; i < pos.size(); i++) {
        arr[2 * i] = pos.get(i);
        arr[2 * i + 1] = neg.get(i);
      }
      int index = pos.size() * 2;
      for (int i = pos.size(); i < neg.size(); i++) {
        arr[index] = neg.get(i);
        index++;
      }

    }
    return arr;
  }

  public static void main(String[] args) {

    int arr[] = { 1, 2, -4, -5, 1, 3, 5, -8 };
    int[] ans = RearrangebySign2(arr);

    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
    System.out.println();
    // ===============================//
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
    ArrayList<Integer> ans1 = RearrangebySign(A);

    for (int i = 0; i < ans1.size(); i++) {
      System.out.print(ans1.get(i) + " ");
    }
  }
}
