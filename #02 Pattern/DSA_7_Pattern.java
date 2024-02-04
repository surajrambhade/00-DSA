//   *
//  ***
// *****

// [4,1,4] - Space - Star - Space
// [3,3,3] - Space - Star - Space 
// [2,5,2] - Space - Star - Space
// [1,7,1] - Space - Star - Space
// [0,9,0] - Space - Star - Space 

//https://www.codingninjas.com/studio/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_7_Pattern {
  public static void nStarTriangle(int n) {
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
  }
}
