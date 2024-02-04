//https://www.codingninjas.com/studio/problems/number-of-digits_4538242?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class DSA_01_No_of_Digits {
  static int countDigit(long x) {
    // int cnt = (int) Math.log10(x) + 1;
    // return cnt;
    int cnt = 0;
    while (x > 0) {
      //long lastDigit = x % 10;
      cnt++;
      x = x / 10;
    }
    return cnt;
  }

  public static void main(String[] args) {
    int result = countDigit(371103);
    System.out.println("Number of digits: " + result);
  }
}
