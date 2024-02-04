// *****
//  ***
//   *

//https://www.codingninjas.com/studio/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_8_Pattern {
  public static void nStarTriangle(int n) {
        
    // For Star = 2Total rows -(2-Curr row no. + 1). - 2n-(2i+1)

    for (int i = 0; i < n; i++) {
        // space
        for (int j = 0; j <i; j++) {
            System.out.print(" ");
        }
        // star
        for (int j = 0; j < 2*n-(2*i+1); j++) {
            System.out.print("*");
        }
        // space
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
