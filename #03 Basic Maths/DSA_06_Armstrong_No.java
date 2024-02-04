//Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number. 
//Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.
// 153 = 1^3 + 5^3 + 3^3
//https://www.codingninjas.com/studio/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class DSA_06_Armstrong_No {
  static boolean ArmstrongNumber(int n) {
    int originalno = n;
    int count = 0;
    int n1 = n;
    while (originalno !=0) {
      //int lasrdigit = originalno % 10;
      count++;
      originalno = originalno / 10;
    }
    int armNo=0;
    while (n1 > 0) {
      int lastdigit = n1 % 10;
      armNo = armNo + (int) Math.pow(lastdigit, count) ;
      n1 = n1 / 10;
    }
    return (armNo == n);
  }

  public static void main(String[] args) {
    boolean result = ArmstrongNumber(1634);
    System.out.println("Check Armstring Number:- " + result);
  } 
}
