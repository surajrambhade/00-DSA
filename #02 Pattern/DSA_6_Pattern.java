// 1 2 3
// 1 2
// 1

// https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_6_Pattern {
  public static void nNumberTriangle(int n) { // total row - row number+1 , n-row+1
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n-i+1; j++) {
    // System.out.print(j +" ");
    // }
    // System.out.println();
    // }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
