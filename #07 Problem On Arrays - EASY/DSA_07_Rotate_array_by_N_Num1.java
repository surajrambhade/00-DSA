////https://www.codingninjas.com/studio/problems/rotate-array_1230543?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

import java.util.ArrayList;
import java.util.Collections;

public class DSA_07_Rotate_array_by_N_Num1 {

  public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int d) {

    int n = arr.size();
    // "Array is empty. Nothing to rotate." Base condition 2: Check if no rotation
    // is needed
    if (n == 0 || d == 0) {
      return arr;
    }

    d = d % n; // Ensure d is within the array size

    // Create a temporary ArrayList to store the rotated elements
    ArrayList<Integer> temp = new ArrayList<Integer>();

    for (int i = d; i < n; i++) {
      temp.add(arr.get(i));
    }

    // Copy the remaining elements to the temporary ArrayList
    for (int i = 0; i < d; i++) {
      temp.add(arr.get(i));
    }
    return temp;
  }

  public static ArrayList<Integer> rotateArray1(ArrayList<Integer> arr, int d) {
    int n = arr.size();
    d = d % n; // Ensure d is within the array size

    // Create a temporary ArrayList to store the rotated elements
    ArrayList<Integer> temp = new ArrayList<Integer>();

    // Copy elements from the rotated section to the temporary ArrayList
    for (int i = 0; i < d; i++) {
      temp.add(arr.get(i + n - d));
    }

    // Copy the remaining elements to the temporary ArrayList
    for (int i = 0; i < n - d; i++) {
      temp.add(arr.get(i));
    }

    return temp;
  }

  public static ArrayList<Integer> rotateArray2(ArrayList<Integer> arr, int d) {
    int n = arr.size();
    Collections.reverse(arr.subList(0, d));
    Collections.reverse(arr.subList(d, n));
    Collections.reverse(arr.subList(0, n));
    return arr;
  }

  // Right rotate
  public static ArrayList<Integer> rotateArrayRight(ArrayList<Integer> arr, int d) {
    int n = arr.size();
    d = d % n; // Ensure d is within the array size

    // Reverse the first part (n-d to n-1)
    Collections.reverse(arr.subList(n - d, n));

    // Reverse the second part (0 to n-d-1)
    Collections.reverse(arr.subList(0, n - d));

    // Reverse the entire list
    Collections.reverse(arr);

    return arr;
  }

  public static void main(String[] args) {
    ArrayList<Integer> eg = new ArrayList<>();
    eg.add(1);
    eg.add(2);
    eg.add(3);
    eg.add(4);
    eg.add(5);
    eg.add(6);
    eg.add(9);
    eg.add(4);

    for (int i = 0; i < eg.size(); i++) {
      System.out.print(eg.get(i) + " ");
    }
    System.out.println("  ");

    ArrayList<Integer> rotatedArray = rotateArray2(eg, 3);

    for (int i = 0; i < rotatedArray.size(); i++) {
      System.out.print(rotatedArray.get(i) + " ");
    }
  }
}
