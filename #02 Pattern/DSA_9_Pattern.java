//   *
//  ***
// *****
// *****
//  ***
//   *

//https://www.codingninjas.com/studio/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_9_Pattern {
  public static void nStarDiamond(int n) {
    // For Space = Total rows - Curr row no. -1.
    // For Star = 2 * Curr row no. + 1.

    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }
      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }


    // For Star = 2Total rows -(2-Curr row no. + 1). - 2n-(2i+1)
    
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.out.print("*");
      }
      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

}
