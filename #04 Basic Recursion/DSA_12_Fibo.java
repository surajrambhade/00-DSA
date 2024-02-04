import java.util.ArrayList;
import java.util.List;
//https://www.codingninjas.com/studio/problems/print-fibonacci-series_7421617?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_12_Fibo {
  public static List<Integer> generateFibonacciNumbers(int n) {
    List<Integer> feb = new ArrayList<>();

    if (n >= 1) {
      feb.add(0);
    }
    if (n >= 2) {
      feb.add(1);
    }

    for (int i = 2; i < n; i++) {
      int nextFib = feb.get(i - 1) + feb.get(i - 2);
      feb.add(nextFib);
    }

    return feb;
  }
  public static int[] generateFibonacciNumbers1(int n) {
    int[] fib = new int[n];

    if (n >= 1) {
        fib[0] = 0;
    }
    if (n >= 2) {
        fib[1] = 1;
    }

    for (int i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }

    return fib;
}

  public static void main(String[] args) {
    // Example usage:
    int n = 10;

    // Generate Fibonacci numbers
    List<Integer> result = generateFibonacciNumbers(n);

    // Print the result
    System.out.println(result);
  }
}
