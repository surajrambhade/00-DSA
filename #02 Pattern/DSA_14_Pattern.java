// A
// A B
// A B C

//https://www.codingninjas.com/studio/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_14_Pattern {
  public static void nLetterTriangle(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + i; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
}
