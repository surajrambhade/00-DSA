//https://www.codingninjas.com/studio/problems/zero-matrix_1171153?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.Arrays;

public class DSA_11_Zero_Matrix {
  // Brute
  public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == 0) {
          markRom(matrix, m, n, i);
          markCol(matrix, m, n, j);
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == -1) {
          matrix.get(i).set(j, 0);
        }
      }
    }
    return matrix;
  }

  private static void markRom(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m, int i) {
    for (int j = 0; j < m; j++) {
      if (matrix.get(i).get(j) != 0) {
        matrix.get(i).set(j, -1);
      }
    }
  }

  private static void markCol(ArrayList<ArrayList<Integer>> matrix, Integer m, Integer n, int j) {
    for (int i = 0; i < n; i++) {
      if (matrix.get(i).get(j) != 0) {
        matrix.get(i).set(j, -1);
      }
    }
  }

  // Better TC- O(2*n*m) sc - O(n) + O(m)
  public static ArrayList<ArrayList<Integer>> zeroMatrix1(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {

    int row[] = new int[n];
    int col[] = new int[m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == 0) {
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (row[i] == 1 || col[j] == 1) {
          matrix.get(i).set(j, 0);
        }
      }
    }
    return matrix;
  }

  // Optimize - in matrix it self
  public static ArrayList<ArrayList<Integer>> zeroMatrix2(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {

    // int[] row = new int[n]; --> matrix[..][0]
    // int[] col = new int[m]; --> matrix[0][..]

    int col0 = 1;
    // step 1: Traverse the matrix and
    // mark 1st row & col accordingly:
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (matrix.get(i).get(j) == 0) {
          // mark i-th row:
          matrix.get(i).set(0, 0);

          // mark j-th column:
          if (j != 0)
            matrix.get(0).set(j, 0);
          else
            col0 = 0;
        }
      }
    }

    // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (matrix.get(i).get(j) != 0) {
          // check for col & row:
          if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
            matrix.get(i).set(j, 0);
          }
        }
      }
    }

    // step 3: Finally mark the 1st col & then 1st row:
    if (matrix.get(0).get(0) == 0) {
      for (int j = 0; j < m; j++) {
        matrix.get(0).set(j, 0);
      }
    }
    if (col0 == 0) {
      for (int i = 0; i < n; i++) {
        matrix.get(i).set(0, 0);
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

    int n = matrix.size();
    int m = matrix.get(0).size();

    ArrayList<ArrayList<Integer>> ans = zeroMatrix2(matrix, n, m);

    System.out.println("The Final matrix is: ");
    for (ArrayList<Integer> row : ans) {
      for (Integer ele : row) {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
  }
}
