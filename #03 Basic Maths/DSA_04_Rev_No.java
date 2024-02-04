import java.util.Scanner;
//https://www.codingninjas.com/studio/problems/reverse-of-a-number_624652?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class DSA_04_Rev_No {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int rev = 0;
		while (s > 0) {
			int lastdigit = s % 10;
			rev = (rev * 10) + lastdigit;
			s = s / 10;
		}
		System.out.print("Rev no.: "+ rev);
	}
}
