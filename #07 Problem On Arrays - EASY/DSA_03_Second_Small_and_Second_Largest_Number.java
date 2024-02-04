//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Arrays;

public class DSA_03_Second_Small_and_Second_Largest_Number {
  public static int[] getSecondOrderElements(int n, int[] arr) {
    Arrays.sort(arr);
    // this is use when we know there is no duplicate element
    int small = arr[1];
    int large = arr[n - 2];

    return new int[] { large, small };
  }

  public static int[] getSecondOrderElements1(int n, int[] arr) {
    Arrays.sort(arr);
    // this is use when we know there is duplicate element
    int small = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > small) {
        small = arr[i];
        break;
      }
    }
    int large = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] < large) {
        large = arr[i];
        break;
      }
    }

    return new int[] { large, small };
  }
// ----------------------------------//
  public static int getSecondSmallest(int n, int[] arr) {
    Arrays.sort(arr);
    int small = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > small) {
        small = arr[i];
        break;
      }
    }
    return small;
  }

  public static int getSecondLargest(int n, int[] arr) {
    Arrays.sort(arr);
    int large = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] < large) {
        large = arr[i];
        break;
      }
    }
    return large;
  }

  public static int[] getSecondOrderElements2(int n, int[] arr) {
  
    int ssmall = getSecondSmallest(n, arr);
    int slarge = getSecondLargest(n, arr);

    return new int[]{ssmall,slarge};

  }

  public static void main(String[] args) {
    int[] array = { 10, 5, 8, 20, 2 };
    int n = array.length;
    int[] result = getSecondOrderElements2(n, array);

    System.out.println("The largest element is: " + result[0]);
    System.out.println("The second largest element is: " + result[1]);
  }
}
