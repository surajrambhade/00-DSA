// ****
// *  *
// *  *
// ****

//https://www.codingninjas.com/studio/problems/ninja-and-the-star-pattern-i_6581920?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class DSA_21_Pattern {
  public static void getStarPattern(int n) {

    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {
        if (i==0 || j ==0 || i == n-1 || j ==n-1 ) {
           System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    getStarPattern(7);
  }
}
