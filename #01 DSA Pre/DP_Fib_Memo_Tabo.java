public class DP_Fib_Memo_Tabo {

  // Memoization array to store computed Fibonacci values
  public static int[] dpFibArray = new int[26];

  // Recursive method using Memoization
  public static int Memoization(int n) {
    // Base cases
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;

    // Check if the result is already computed
    if (dpFibArray[n] != 0) {
      return dpFibArray[n];
    }

    // Recursive calls for the two previous Fibonacci numbers
    int op1 = Memoization(n - 1);
    int op2 = Memoization(n - 2);

    // Calculate the current Fibonacci number and store it in the array
    int res = op1 + op2;
    dpFibArray[n] = res;

    return res;
  }

  // Tabulation method to calculate Fibonacci using an iterative approach
  public static int Tabulation(int n) {
    // Array to store Fibonacci values
    int dp[] = new int[n + 1];

    // Base cases
    dp[0] = 0;
    dp[1] = 1;

    // Fill the array iteratively
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    // Return the final Fibonacci number
    return dp[n];
  }

  public static void main(String[] args) {
    // Example usage
    System.out.println("The value of 5th Fibonacci By Memoization:- " + Memoization(5));
    System.out.println("The value of 5th Fibonacci By Tabulation:- " + Tabulation(5));
  }
}
