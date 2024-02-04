//https://www.codingninjas.com/studio/problems/linear-search_6922070?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_09_Linear_Search {
  public static int linearSearch(int n, int num, int[] arr) {

    for (int i = 0; i < n; i++) {
      if (arr[i] == num) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] array = {1, 3, 5, 7, 9, 11, 13};
    int numberToSearch = 7;

    int result = linearSearch(array.length, numberToSearch, array);

    if (result != -1) {
        System.out.println("Number found at index: " + result);
    } else {
        System.out.println("Number not found in the array.");
    }
  }
}
