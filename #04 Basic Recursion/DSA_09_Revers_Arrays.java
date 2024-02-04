//https://www.codingninjas.com/studio/problems/reverse-an-array_8365444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_09_Revers_Arrays {
  public static int[] reverseArray(int n, int[] nums) {
      reverse(nums, 0, n - 1);
      return nums;
  }

  private static void reverse(int[] nums, int start, int end) {
      if (start >= end) {
          return;
      } else {
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] = temp;
          reverse(nums, start + 1, end - 1);
      }
  }
  public static void main(String[] args) {
    int[] s= {1,2,3,3,4,6,7};

    int[] arr = reverseArray(s.length, s);
    for(int rev: arr){
    System.out.print(rev + " ");
    }
  }
}
