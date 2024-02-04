// 1           1  [1,6,1] - Number, Space, Number === for space = 2 * (n - 1)
// 1 2       2 1  [2,4,2] - Number, Space, Number === for space = 2 * (n - 1)
// 1 2 3   3 2 1  [3,2,3] - Number, Space, Number === for space = 2 * (n - 1)
// 1 2 3 4 4 2 1  [4,0,4] - Number, Space, Number === for space = 2 * (n - 1)

//https://www.codingninjas.com/studio/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_12_Pattern {
  public static void numberCrown(int n) {

    int space = 2 * (n - 1);

    for (int i = 1; i <= n; i++) {
      // number
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      // space
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      // number
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
      space -= 2;
    }
  }
}

// Initialization:

// At the beginning of each iteration, the value of space is calculated as 2 * (n - 1).
// For the first row, n = 4, so space = 2 * (4 - 1) = 6.
// Inside the loop:

// After printing the increasing and decreasing numbers for the current row, space is reduced by 2 using space -= 2;.
// This reduction ensures that the number of spaces between the increasing and decreasing numbers decreases by 2 in each iteration.
// Effect:

// For the first row, there are 6 spaces.
// For the second row, there are 4 spaces.
// For the third row, there are 2 spaces.
// For the fourth row, there are 0 spaces.