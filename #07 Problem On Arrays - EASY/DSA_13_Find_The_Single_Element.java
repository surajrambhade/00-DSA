//https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.HashMap;
import java.util.Map;

public class DSA_13_Find_The_Single_Element {

  // Brute approch 1
  public static int getSingleElement(int[] arr) {
    int N = arr.length;

    for (int i = 0; i < N; i++) {
      int count = 0;

      for (int j = 0; j < N; j++) {
        if (i != j && arr[i] == arr[j]) {
          count++;
          break;
        }
      }
      // If no duplicate is found, return the single element
      if (count == 0) {
        return arr[i];
      }
    }
    // If no single element is found, return a default value (you may modify this
    // accordingly)
    return -1;
  }

  // approch 2
  public static int getSingleElement2(int[] arr) {
    // size of the array:
    int n = arr.length;

    // Find the maximum element:
    int maxi = arr[0];
    for (int i = 0; i < n; i++) {
      maxi = Math.max(maxi, arr[i]);
    }

    // Declare hash array of size maxi+1
    // And hash the given array:
    int[] hash = new int[maxi + 1];
    for (int i = 0; i < n; i++) {
      hash[arr[i]]++;
    }
    
    // Find the single element and return the answer:
    for (int i = 0; i < n; i++) {
      if (hash[arr[i]] == 1)
        return arr[i];
    }

    // This line will never execute
    // if the array contains a single element.
    return -1;
  }

  //approch 3
   public static int getSingleElement3(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
    // aptimize 4
    public static int getSingleElement4(int []arr) {
      //size of the array:
      int n = arr.length;

      // XOR all the elements:
      int xorr = 0;
      for (int i = 0; i < n; i++) {
          xorr = xorr ^ arr[i]; //In mutleple XOR same same became 0
      }
      return xorr;
  }

  // optimize solution 5
  public static int getSingleElement5(int[] arr) {
    int result = 0;
    for (int num : arr) {
      result ^= num;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
    int singleElement = getSingleElement4(arr);

    System.out.println("The single element is: " + singleElement);
  }
}
