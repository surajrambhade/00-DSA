
//https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_09_Sum_of_all_divisors {

  public static int sumOfAllDivisors(int n) {
    int sumOfAllDivisors = 0;

    for (int j = 1; j <= n; j++) {
      for (int i = 1; i <= Math.sqrt(j); i++) {
        if (j % i == 0) {
          sumOfAllDivisors += i;
          // Avoid counting the same divisor twice for perfect squares
          if (j / i != i) {
            sumOfAllDivisors += j / i;
          }
        }
      }
    }

    return sumOfAllDivisors;
  }
  public static void main(String[] args) {
    System.out.println("Sum:- " + sumOfAllDivisors(5));
  }
}