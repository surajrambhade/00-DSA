// 1
// 1 2 
// 1 2 3

//https://www.codingninjas.com/studio/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_4_Pattern {
  public class Solution {
    public static void nTriangle(int n) {
      // Write your code here
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
    }
  }
}
