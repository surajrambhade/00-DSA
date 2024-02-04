import java.util.ArrayList;
//https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class DSA_02_Sort_An_Array_of_0s_1s_2s {

  // Better Approch TC - O(2n)
  public static void sortArray(ArrayList<Integer> arr, int n) {

    int countZer = 0;
    int countOne = 0;
    int countTwo = 0;

    for (int i = 0; i < n; i++) {
      if (arr.get(i) == 0) {
        countZer++;
      } else if (arr.get(i) == 1) {
        countOne++;
      } else {
        countTwo++;
      }
    }
    arr.clear();
    for (int i = 0; i < countZer; i++) {
      arr.add(0);
    }
    for (int i = countZer; i < countZer + countOne; i++) {
      arr.add(1);
    }
    for (int i = countZer + countOne; i < n; i++) {
      arr.add(2);
    }

  }

  // DUTCH National Flag Algo
  public static void sortArray1(ArrayList<Integer> arr, int n) {

    int low = 0, mid = 0, high = n - 1;
    while (mid <= high) {
      if (arr.get(mid) == 0) {
        int temp = arr.get(low);
        arr.set(low, arr.get(mid));
        arr.set(mid, temp);
        low++;
        mid++;
      } else if (arr.get(mid) == 1) {
        mid++;
      } else {
        int temp = arr.get(mid);
        arr.set(mid, arr.get(high));
        arr.set(high, temp);
        high--;
      }
    }

  }

  public static void main(String[] args) {

  }
}
