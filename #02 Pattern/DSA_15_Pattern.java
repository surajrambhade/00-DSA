// A B C
// A B
// A

//https://www.codingninjas.com/studio/problems/reverse-letter-triangle_6581906?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_15_Pattern {
  public static void nLetterTriangle(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
}
