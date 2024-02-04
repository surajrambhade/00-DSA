// *
// **
// ***
// **
// *

//https://www.codingninjas.com/studio/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_10_Pattern {
  public static void nStarTriangle(int n) {
    // Outer loop to iterate over rows
    for (int i = 0; i <= 2 * n; i++) {
      // Calculate the number of stars for the current row
      int stars = i;
      // If the row number is greater than 'n', adjust stars for the second half of the triangle
      if (i > n) {
        stars = 2 * n - i;
      }
      // Inner loop to print the stars in the current row
      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      // Move to the next line after printing stars for the current row
      System.out.println();
    }
  }
}

    // public static void nStarTriangle(int n) {
    //     for (int i = 1; i <= 2 * n-1; i++) {
    //         int stars = i;
    //         if (i > n) {
    //             stars = 2 * n - i;
    //         }
    //         for (int j = 0; j <= stars-1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
