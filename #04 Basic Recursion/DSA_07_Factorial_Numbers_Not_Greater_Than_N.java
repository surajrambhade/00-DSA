import java.util.ArrayList;
import java.util.List;
//https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class DSA_07_Factorial_Numbers_Not_Greater_Than_N {

  public static List<Long> factorialNumbers(long n) {

    List<Long> factList = new ArrayList<>();
    if (n == 1) {
        factList.add(n);
        return factList;
    }

    for (int i = 1;i<=n; i++) {
        long factorial = factorial(i);
        if (factorial <= n) {
            factList.add(factorial);
        }else{
            break;
        }
        
    }
    return factList;
}

public static long factorial(long num) {
    if (num==0 || num == 1) {
        return 1;
    } else {
        return num * factorial(num - 1);
    }
}

  public static void main(String[] args) {
    long n = 7; 
    List<Long> result = factorialNumbers(n);

    // Print the result list
    System.out.println("Factorials of numbers from 0 to " + n + ": " + result);

  }
}
