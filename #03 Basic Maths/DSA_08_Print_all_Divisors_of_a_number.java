//https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DSA_08_Print_all_Divisors_of_a_number {
  public static List<Integer> printDivisors(int n) {

    // int n1 = n;
    // List<Integer> temp = new Vector<>();
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // // System.out.print(i + " ");
    // temp.add(i);
    // }
    // }
    // return temp;

    List<Integer> temp = new Vector<>();
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        temp.add(i);
        if (n / i != i) {
          temp.add(n / i);
        }
      }
    }
    Collections.sort(temp);
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(printDivisors(5));
  }
}
