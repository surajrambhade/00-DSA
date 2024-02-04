// 1
// 0 1
// 1 0 1

//https://www.codingninjas.com/studio/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_11_Pattern {
  public static void nBinaryTriangle(int n) {
    int start = 1;
    for (int i = 0; i < n; i++) {

      if (i % 2 == 0) {
        start = 1;
      } else {
        start = 0;
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(start + " ");
        start = 1 - start;
      }
      System.out.println();
    }
  }
}
