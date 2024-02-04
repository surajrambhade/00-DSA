//https://www.codingninjas.com/studio/problems/missing-number_6680467?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse

import java.util.HashSet;

public class DSA_12_Missing_Number {
  // best - brute approch
  public static int missingNumber(int[] arr, int N) {

    for (int i = 1; i <= N; i++) {
      int flag = 0;
      for (int j = 0; j < N - 1; j++) {
        if (arr[j] == i) {
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        return i;
      }
    }
    return N;
  }

  // better
  public static int missingNumber1(int[] arr, int N) {

    HashSet<Integer> st = new HashSet<Integer>(N + 1);

    // Adding elements of the array to HashSet
    for (int i = 0; i < N; i++) {
      st.add(arr[i]);
    }

    // Checking for missing number in the HashSet
    for (int i = 1; i <= N - 1; i++) {
      if (!st.contains(i)) {
        return i;
      }
    }
    return N;
  }

  // optimal 1
  public static int missingNumber2(int[] arr, int N) {

    int sum1 = N * (N + 1) / 2;
    int sum2 = 0;

    // Loop through all elements of the array
    for (int i = 0; i < N - 1; i++) {
      sum2 += arr[i];
    }

    return (sum1 - sum2);
  }

  //// optimal 2
  public static int missingNumber3(int[] a, int N) {

    int xor1 = 0, xor2 = 0;

    for (int i = 0; i < N - 1; i++) {
      xor2 = xor2 ^ a[i]; // XOR of array elements
      xor1 = xor1 ^ (i + 1); // XOR up to [1...N-1]
    }
    xor1 = xor1 ^ N; // XOR up to [1...N]

    return (xor1 ^ xor2); // the missing number
  }

  public static void main(String[] args) {
    // for frist function
    int[] inputArray = { 0, 1, 3, 4, 5 }; // Assuming 2 is missing
    int N = inputArray.length + 1; // Assuming one element is missing

    int missingNumber = missingNumber(inputArray, N);

    System.out.println("The missing number is: " + missingNumber);
    // for 2nd function
    int[] inputArray1 = { 0, 1, 3, 4, 5 }; // Assuming 2 is missing
    int N1 = inputArray1.length; // Assuming one element is missing

    int missingNumber1 = missingNumber1(inputArray, N1);

    System.out.println("The missing number is1: " + missingNumber1);

    // for 3rd Using the third function to find the missing number
    int[] inputArray2 = { 1, 2, 4, 5 }; // Assuming 2 is missing
    int N2 = inputArray2.length + 1; // Assuming one element is missing

    int missingNumber2 = missingNumber3(inputArray2, N2);

    System.out.println("The missing number is2: " + missingNumber2);

    // 3 funtion 
    int N5 = 5;
    int a[] = { 1, 2, 4, 5 };

    int ans = missingNumber(a, N5);
    System.out.println("The missing number is: " + ans);
  }
}
