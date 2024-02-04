//https://www.codingninjas.com/studio/problems/rotate-the-matrix_6825090?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Arrays;

public class DSA_12_Rotate_The_Matrix {

  // brute
  public static int[][] rotateMatrix(int[][] arr) {
    int n = arr.length;
    int rotate[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        rotate[j][n - 1 - i] = arr[i][j];
      }
    }

    return rotate;
  }

  // brute
  public static void rotateMatrix1(int[][] arr) {
    int n = arr.length;
    int rotate[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        rotate[j][n - 1 - i] = arr[i][j];
      }
    }

    // Copy the rotated matrix back to the original matrix
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = rotate[i][j];
      }
    }
  }

  // optimize
  public static void rotateMatrix2(int[][] matrix) {
    int n = matrix.length;
    // Transpose the matrix
    for (int i = 0; i < n-1; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // reverse
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int rotated[][] = rotateMatrix(arr);
    System.out.println("Rotated Image");
    for (int i = 0; i < rotated.length; i++) {
      for (int j = 0; j < rotated.length; j++) {
        System.out.print(rotated[i][j] + " ");
      }
      System.out.println();
    }

    ///////////////////////////////////////////////
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("Original Matrix:");
    printMatrix(matrix);

    // Rotate the matrix
    rotateMatrix2(matrix);

    System.out.println("Rotated Matrix:");
    printMatrix(matrix);
  }

  public static void printMatrix(int[][] matrix) {
    // for (int[] row : matrix) {
    // for (int value : row) {
    // System.out.print(value + " ");
    // }
    // System.out.println();
    // }
    // System.out.println();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
