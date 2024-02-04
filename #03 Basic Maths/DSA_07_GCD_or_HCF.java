// https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
// GCD - Greatest Commom divisor . 
// HCF - Higest Commom Fator .
// Euclidean Algorithm - gcd(a, b) = gcd(a-b, b)   -- > is in book.
// But more optimize is - gcd(a, b) = gcd(a%b, b) ( where a>b a<b -> make contion for this ) 
// time complexity - O(log(min(n, m)) 
public class DSA_07_GCD_or_HCF {

  // Brute-force method
  public static int calcGCD(int n, int m) {
    int gcd = 1;
    for (int i = Math.min(n, m); i >= 1; i--) {
      if (n % i == 0 && m % i == 0) {
        gcd = i;
        break;
      }
    }
    return gcd;
  }

  // Another brute-force method
  public static int calcGCD1(int n, int m) {
    int gcd = 1;
    for (int i = 1; i <= Math.min(n, m); i++) {
      if (n % i == 0 && m % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }

  // Optimized using Euclidean Algorithm
  public static int calcGCD2(int n, int m) {
    while (m != 0) {
      int temp = m;
      m = n % m;
      n = temp;
    }
    return n;
  }

  // More optimized using Euclidean Algorithm (shorter version)
  public static int calcGCD3(int a, int b) {
    while (a > 0 && b > 0) {
      if (a > b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }
    return a + b;
  }

  // Recursive version of Euclidean Algorithm
  public static int calcGCD4(int n, int m) {
    return (m == 0) ? n : calcGCD4(m, n % m);
  }

  public static void main(String[] args) {
    int num1 = 48;
    int num2 = 18;
    int gcd = calcGCD3(num1, num2);
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
  }
}
