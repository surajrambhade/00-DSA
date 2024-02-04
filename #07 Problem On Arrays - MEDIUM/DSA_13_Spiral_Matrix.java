
import java.util.*;

public class DSA_13_Spiral_Matrix {
  public static int[] spiralMatrix(int[][] MATRIX) {
    int n = MATRIX.length;
    int m = MATRIX[0].length;
    int left = 0, right = m - 1;
    int top = 0, bottom = n - 1;

    int[] ans = new int[n * m];
    int index = 0;
    // Loop until all elements are not traversed.
    while (top <= bottom && left <= right) {
     // For moving left to right
      for (int i = left; i <= right; i++) {
        ans[index++] = MATRIX[top][i];
      }
      top++;

      // Traverse right column // For moving top to bottom.
      for (int i = top; i <= bottom; i++) {
        ans[index++] = MATRIX[i][right];
      }
      right--;

      // Traverse bottom row  // For moving right to left.
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          ans[index++] = MATRIX[bottom][i];
        }
        bottom--;
      }

      // Traverse left column // For moving bottom to top.
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          ans[index++] = MATRIX[i][left];
        }
        left++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    // Calling your spiralMatrix method
    int[] result = spiralMatrix(matrix);

    // Printing the result
    System.out.println("Spiral Order:");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}
