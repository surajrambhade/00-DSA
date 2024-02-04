import java.util.ArrayList;
import java.util.Scanner;

public class DP_Fibonaci {

	static int fib(int n){
		if (n==1 || n==2) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

	static int fibDP(int n, ArrayList<Integer> dp){
		if (n==1 || n ==2) {
      return 1;
    }
    if (dp.get(n) == -1) {
      dp.get(n);
    }
    int val = fibDP(n-1, dp) + fibDP(n-2, dp);
    dp.set(n, val);
    return val;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(fib(n));

		 ArrayList<Integer> dp = new ArrayList<>();
		for(int i=0;i<=n;i++){
			dp.add(i);
		}
		System.out.println(fibDP(n,dp));


    //-----------Moizing---------// - Tabuizaing - bottom - top approch
    // if (n == 1 || n==2) {
    //   System.out.println(1);
    // }
    // dp.add(1); // 0th Index
    // dp.add(1); // Base Case
    // dp.add(2); // Base Case 
    // for(int i =3;i<=n;i++){
    //   dp.add(dp.get(i-1) + dp.get(i-2));
    // }
		// System.out.println(dp.get(n));
	}
}
