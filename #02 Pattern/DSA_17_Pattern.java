//     A
//   A B A
// A B C B A

//https://www.codingninjas.com/studio/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_17_Pattern {
  public static void alphaHill(int n) {
    for (int i = 0; i < n; i++) {
        // space
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        // Char
        // breakpoint = (2 * i + 1)/2
        int ch = 'A';
        int breakpoint = (2 * i + 1) / 2;
        for (int j = 1; j <= 2 * i + 1; j++) {
            System.out.print( (char)(ch) + " ");
            if (j <= breakpoint) {
                ch++;
            } else {
                ch--;
            }
        }
        // space
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
