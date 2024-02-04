public class DSA_02_Print_N_To_1 {
  public static int[] generateArray(int n) {
      if (n <= 0) {
          return new int[0]; // Return an empty array for invalid input
      }

      int[] result = new int[n];
      generateArrayRecursion(result, n, 0);
      return result;
  }

  private static void generateArrayRecursion(int[] result, int x, int index) {
      if (x > 0) {
          result[index] = x;
          generateArrayRecursion(result, x - 1, index + 1);
      }
  }

  public static void main(String[] args) {
      int n = 5; // You can replace this with any positive integer
      int[] result = generateArray(n);

      // Print the result array
      for (int num : result) {
          System.out.print(num + " ");
      }
  }
}
