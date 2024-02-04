
import java.util.Scanner;

class DSA_07_Rotate_array_by_N_Num {
    public static void leftRotate(int[] arr, int k) {
        if (k == 0 || k % arr.length == 0) {
            return;
        }
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            int firstEle = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstEle;
        }
    }

    public static void main(String args[]) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many no. of Element:- ");
        int n = sc.nextInt();
        System.out.print("Enter the element:- ");
        // Input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter By How Many No. need to shift:- ");
        int k = sc.nextInt();
        leftRotate(arr, k);

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

