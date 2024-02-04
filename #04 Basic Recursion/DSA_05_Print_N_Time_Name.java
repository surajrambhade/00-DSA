
//https://www.codingninjas.com/studio/problems/-print-n-times_8380707?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.ArrayList;
import java.util.List;

public class DSA_05_Print_N_Time_Name {
    public static List<String> printNtimes(int n) {

        if (n < 0) {
            return new ArrayList<String>(n);
        }
        List<String> res = new ArrayList<>();
        genArrayRec(res, n);
        return res;
    }

    public static void genArrayRec(List<String> res, int n) {
        if (n > 0) {
            res.add("Nagpurian Suraj ");
            genArrayRec(res, n - 1);
            
        }
    }
    public static void main(String[] args) {
      int n = 4;
      System.out.print("REC" + printNtimes(n));
    }
}