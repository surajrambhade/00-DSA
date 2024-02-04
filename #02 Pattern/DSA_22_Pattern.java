// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

//https://www.codingninjas.com/studio/problems/ninja-and-the-number-pattern-i_6581959?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class DSA_22_Pattern {
    public static void getNumberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      getNumberPattern(4);
    }
}

/*
 
  Step 1:
  i = 0, j = 0
  top = 0, left = 0, right = 6, down = 6
  min(top, down, left, right) = 0
  Print: 4

  i = 0, j = 1
  top = 0, left = 1, right = 5, down = 6
  min(top, down, left, right) = 0
  Print: 4

  ... (continue for all j values in the first row)

  Step 2:
  i = 1, j = 0
  top = 1, left = 0, right = 6, down = 5
  min(top, down, left, right) = 0
  Print: 4

  i = 1, j = 1
  top = 1, left = 1, right = 5, down = 5
  min(top, down, left, right) = 1
  Print: 3

  ... (continue for all j values in the second row)

  ... (continue for all i values in subsequent rows)

  Final Output:
  4444444
  4333334
  4322234
  4321234
  4322234
  4333334
  4444444

 */