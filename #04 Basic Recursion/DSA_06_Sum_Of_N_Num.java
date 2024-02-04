//https://www.codingninjas.com/studio/problems/sum-of-first-n-numbers_8876068?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_06_Sum_Of_N_Num {
  public static long sumFirstN(long n) {

      return sumOfAll(n, 1, 0);
  }

  public static long sumOfAll(long n, long curr, long sum) {
      if ( curr > n) {
          return sum;
      } else {
          return sumOfAll(n, curr + 1, sum + curr);
      }
  }
  public static void main(String[] args) {
    int n =5;
    System.out.println("Sum: " + sumFirstN(n));
  }
}