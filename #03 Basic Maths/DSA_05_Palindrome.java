//https://www.codingninjas.com/studio/problems/palindrome-number_624662?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class DSA_05_Palindrome {
  public static boolean palindromeNumber(int n) {
    int rev = 0;
    int n1 = n;
    while (n > 0) {
        int lastdigit = n % 10;
        rev = (rev * 10) + lastdigit;
        n = n / 10;
    }
    
     // Do not compare with n bcz n is zero now make duplicate
    if (rev == n1) { 
        return true;
    } else {
        return false;
    }
}
  public static void main(String[] args) {
    System.out.println("Answer: " + palindromeNumber(121));
    
  }
}