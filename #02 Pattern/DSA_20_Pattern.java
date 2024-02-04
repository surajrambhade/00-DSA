// *         * []
// * *     * * []
// * * * * * * []
// * *     * * []
// *         * []

//https://www.codingninjas.com/studio/problems/symmetry_6581914?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_20_Pattern {

  public static void symmetry(int n) {
    int spaces = 2 * n - 2;
    for (int i = 1; i <= 2 * n - 1; i++) {
      // stars
      int stars = i;
      if (i > n) {
        stars = 2 * n - i;
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("* ");
      }
      // space
      for (int j = 1; j <= spaces; j++) {
        System.out.print("  ");
      }
      // stars
      for (int j = 1; j <= stars; j++) {
        System.out.print(" *");
      }
      System.out.println();
      if (i < n) {
        spaces -= 2;
      } else {
        spaces += 2;
      }
    }
  }

  public static void main(String[] args) {
    symmetry(5);
  }
}
