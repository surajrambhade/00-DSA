//              [Stars , Space , Stars ]

// * * * * * *  [5,0,5] <- all for upper
// * *     * *  [4,2,4]
// *         *  [3,4,3]
// *         *  [2,6,2]
// * *     * *  [1,8,1]
// * * * * * * 

//https://www.codingninjas.com/studio/problems/symmetric-void_6581919?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
// Very Hard Yr 
public class DSA_19_Pattern {
  public static void symmetry(int n) {
    int iniS = 0;
    for (int i = 0; i < n; i++) {
      //Star
      // for printing the stars in the row.
      for (int j = 1; j <= n - i; j++) {
        System.out.print("* ");
      }
      //Space
      // for printing the spaces in the row.
      for (int j = 0; j < iniS; j++) {
        System.out.print("  ");
      }
      //Star
      // for printing the stars in the row.
      for (int j = 1; j <= n - i; j++) {
        System.out.print("* ");
      }

      // The spaces increase by 2 every time we hit a new row.
      iniS += 2;
      System.out.println();
    }

    // for lower half of the pattern

    // initial spaces.
    iniS = 2 * n - 2;
    for (int i = 1; i <= n; i++) {
      //Star
      // for printing the stars in the row.
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      //Space
      // for printing the spaces in the row.
      for (int j = 0; j < iniS; j++) {
        System.out.print("  ");
      }
      //Star
      // for printing the stars in the row.
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      // The spaces decrease by 2 every time we hit a new row.
      iniS -= 2;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    symmetry(5);
  }

}