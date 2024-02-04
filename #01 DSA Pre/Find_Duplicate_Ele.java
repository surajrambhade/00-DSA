import java.util.ArrayList;
import java.util.Collections;

public class Find_Duplicate_Ele {
  static int find_Duplicate_Ele(ArrayList<Integer> arr, int n) {
    // Way 1

    Collections.sort(arr);
    for (int i = 1; i < n; ++i) {
      if (arr.get(i) == arr.get(i - 1)) {
        return arr.get(i);
      }
    }

    // way 2
    /*
     * for(int i=0;i<n;++i){
     * for(int j=i+1;j<n;++j){
     * if (arr.get(i) == arr.get(j)) {
     * return arr.get(i);
     * }
     * }
     * }
     * 
     */

    return -1;

    /*
     * 
     * for (int i = 0; i < n; i++) {
     * for (int j = i + 1; j < n; j++) {
     * if (arr.get(i).equals(arr.get(j))) {
     * return arr.get(i);
     * }
     * }
     * }
     * return -1;
     * 
     */
  }

  public static void main(String[] args) {
    ArrayList<Integer> nu = new ArrayList<>();
    nu.add(1);
    nu.add(4);
    nu.add(55);
    nu.add(12);
    nu.add(132);
    nu.add(55);
    nu.add(6);
    nu.add(3);

    System.out.println("Duplicate: " + find_Duplicate_Ele(nu, 8));

  }
}
