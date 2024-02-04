//https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class DSA_08_Move_Zero_to_End {

  public static int[] moveZeros(int n, int[] a) {

    int[] temp = new int[n];
    int index = 0;
    // Add non-zero elements to temp array
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        temp[index] = a[i];
        index++;
      }
    }
    // Fill the remaining positions with zeros
    while (index < n) {
      temp[index] = 0;
      index++;
    }
    return temp;
  }

  public static int[] moveZeros0(int n, int[] a) {

    int j = -1;
    for (int i = 0; i < n; i++) {
      if (a[i] == 0) {
        j = i;
        break;
      }
    }
    if (j == -1) {
      return a;
    }

    for (int i = j + 1; i < n; i++) {
      if (a[i] != 0) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        j++;
      }
    }

    return a;
  }

  public static void main(String[] args) {
    int[] a = { 1, 0, 3, 0, 5, 0, 6 };
    int n = a.length;

    int[] result = moveZeros0(n, a);

    // Print the result
    System.out.print("Result: ");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}
