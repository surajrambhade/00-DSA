// A
// B B
// C C C

//https://www.codingninjas.com/studio/problems/alpha-ramp_6581888?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_16_Pattern {
  public static void alphaRamp(int n) {
    for (int i = 0; i < n; i++) {
      char ch = (char) ('A' + i);
      for (int j = 0; j <= i; j++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
}