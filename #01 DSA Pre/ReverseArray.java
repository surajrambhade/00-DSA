/* 
 We have an array ARR = (1, 2, 3, 4, 5, 6) and H = 3, considering 0 based 
 indexing so the subarray (5, 6) will be reversed and our output array will be 
 (1, 2, 3, 4, 6, 5). 
 */

import java.util.ArrayList;

public class ReverseArray {

  static void reverseArray(ArrayList<Integer> arr, int m) {
    int i = m + 1, j = arr.size() - 1;
    while (i < j) {
      int temp = arr.get(i);
      arr.set(i, arr.get(j));
      arr.set(j, temp);
      ++i;
      --j;
    }
  }

  public static void main(String[] args) {

    ArrayList<Integer> nu = new ArrayList<>();
    nu.add(1);
    nu.add(4);
    nu.add(2);
    nu.add(12);
    nu.add(132);
    nu.add(55);
    nu.add(6);
    nu.add(3);

    System.out.println("Org: " + nu);
    reverseArray(nu, 3);
    System.out.println("rev: " + nu);
  }
}
