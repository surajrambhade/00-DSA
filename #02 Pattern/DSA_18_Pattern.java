// C
// C B 
// C B A

//https://www.codingninjas.com/studio/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_18_Pattern {
  public static void alphaTriangle(int n) {
    for (int i = 0; i < n; i++) {
      char ch = 'C';
      for (int j = 0; j <= i; j++) {
        System.out.print(ch + " ");
        ch--; // Decrementing the character for the next iteration
      }
      System.out.println();
    }
  }
}
