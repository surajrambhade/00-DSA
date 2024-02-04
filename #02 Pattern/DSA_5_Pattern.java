// * * *
// * *
// *

//https://www.codingninjas.com/studio/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_5_Pattern {
  public class Solution {
    public static void seeding(int n) { // total row - row number+1 , n -row+1
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i + 1; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }
}