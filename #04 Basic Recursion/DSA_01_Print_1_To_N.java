//https://www.codingninjas.com/studio/problems/print-1-to-n_628290?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_01_Print_1_To_N {

  public static int[] printNos(int n) {
    // Return an empty array for invalid input
    if (n <= 0) {
      return new int[0];
    }
    int res[] = new int[n];
    genArrayRec(res, n);
    return res;
  }

  static void genArrayRec(int[] res, int n) {
    if (n>0) {
      genArrayRec(res, n-1);
      res[n-1]=n;
    }
  }
  public static void main(String[] args) {
    int n = 6; 
    int[] result = printNos(n);

    // Print the result array
    for (int num : result) {
        System.out.print(num + " ");
    }
  }
}