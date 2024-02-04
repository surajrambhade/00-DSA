// m   n ->   l       
//            0  1   2   3   -- Index
// k - 0      1  2   3   4
//     1      5  6   7   8   -- m - no. of row
//     2      9  10  11 12   -- n - no. of col
//     3      13 14  15 16 

public class Sprial_Matrix {
  static void sprialPrint(int m, int n, int a[][]) {

    int i, k = 0, l = 0;
    while (k < m && 1 < n) {
      for (i = l; i < n; i++) {
        System.out.print(a[k][i] + " ");
      }
      k++;
      for (i = k; i < m; i++) {
        System.out.print(a[i][n - 1] + " ");
      }
      n--;
      if (k < m) {
        for (i = n - 1; i >= l; i--) {
          System.out.print(a[m - 1][i] + " ");
        }
      m--;
      }
      if (l < n) {
        for (i = m - 1; i >= k; i--) {
          System.out.print(a[i][l] + " ");
        }
        l++;
      }
    }

  }

  public static void main(String[] args) {
    int r = 4;
    int c = 4;
    int a[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };
    sprialPrint(r, c, a);
  }
}
