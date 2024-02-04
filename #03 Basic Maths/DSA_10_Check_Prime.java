//https://www.codingninjas.com/studio/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Number which has only two factor 1 & itself is Prime

public class DSA_10_Check_Prime {
  public static String isPrime(int num) {
    if (num <= 1) {
      return "NO";
    }
    for (int i = 2; i * i <= num; i++) { // Math.sqrt(num)
      if (num % i == 0) {
        return "NO";
      }
    }
    return "YES";
  }

  public static void main(String[] args) {
    int n = 7;
    System.out.println("Check Prime:- " + isPrime(n));
  }
}
