import java.util.PriorityQueue;

public class KLargestEle_and_Sort {
  public static int[] Klargest(int[] a, int k, int n) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int i = 0; i < n; i++) {
      pq.add(a[i]);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    // i will have a k size priority queue.
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
      ans[i] = pq.peek();
      pq.poll();
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] array = { 6, 2, 7, 1, 9, 3, 4, 5, 8 };
    int k = 3;
    int n = array.length;
    int[] result = Klargest(array, k, n);
    // Print the result
    System.out.print("K largest elements are: ");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}
