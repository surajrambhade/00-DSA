//https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class DSA_02_Count_Digits {
  public static int countDigits(int n) {

      int cnt = 0;
      int n1 = n;

      while (n1 > 0) {
          // Extract the last digit
          int rem = n1 % 10;
          // Check if the digit is not zero and n is divisible by the digit
          if (rem != 0 && n % rem == 0) {
              cnt++;
          }
          // Move to the next digit
          n1 = n1 / 10;
      }
      // Return the final count of digits
      return cnt;
  }
  public static void main(String[] args) {
    int result = countDigits(35);
    System.out.println("Count of digits: " + result);
  }
}
