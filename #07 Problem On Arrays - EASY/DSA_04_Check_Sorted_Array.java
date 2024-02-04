
public class DSA_04_Check_Sorted_Array {
  public static int isSorted(int n, int[] arr) {

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return 0;
      }
    }
    return 1;
  }
  public static void main(String[] args) {
    int[] arr = {1,3,2,1,4};
    int n = arr.length;
    System.out.println("isSort: 0 = No , 1 = Yes || Answer - " +isSorted(n, arr));
  }
}
