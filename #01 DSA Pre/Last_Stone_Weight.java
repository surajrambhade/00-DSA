import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone_Weight {

  public static int weightOfLastStone(int arr[]) {

    // Create a max heap using PriorityQueue
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

    // Add all elements of the array to the max heap
    for (int i = 0; i < arr.length; i++) {
      pq.add(arr[i]);
    }

    // Continue until there is only one stone left
    while (pq.size() > 1) {
      // Extract the two heaviest stones
      int x = pq.poll();  // Heaviest stone
      int y = pq.poll();  // Second heaviest stone

      // If the stones are different in weight, smash them and add the result back to the heap
      if (x != y) {
        pq.add(x - y);
      }
      // If the stones are of equal weight, both are destroyed, and nothing is added back
    }

    // If there is one stone left, return its weight; otherwise, return 0
    if (pq.size() == 1) {
      return pq.peek();
    }
    return 0;
  }

  public static void main(String[] args) {
    // Example array of stone weights
    int[] arr = { 2, 7, 4, 1, 8, 1 };

    // Calculate the weight of the last stone
    int result = weightOfLastStone(arr);

    // Print the result
    System.out.println("Weight of last stone: " + result);
  }
}

/* NOTE :- Dry run is not that much right.
 
Initialization:

Create an empty max heap (PriorityQueue in reverse order): pq = {}
Add all elements of the array to the max heap: pq = {8, 7, 4, 2, 1, 1}
Smashing Stones Loop:

Iteration 1:
Extract the two heaviest stones: x = 8, y = 7
Smash the stones, and add the result back to the heap: pq = {1, 1, 4, 1}
Iteration 2:
Extract the two heaviest stones: x = 4, y = 1
Smash the stones, and add the result back to the heap: pq = {1, 1, 3}
Iteration 3:
Extract the two heaviest stones: x = 3, y = 1
Smash the stones, and add the result back to the heap: pq = {1, 2}
Iteration 4:
Extract the two heaviest stones: x = 2, y = 1
Smash the stones, and add the result back to the heap: pq = {1, 1}
Iteration 5:
Extract the two heaviest stones: x = 1, y = 1
Since the stones are of equal weight, both are destroyed, and nothing is added back.
Result:

If there is one stone left, return its weight; otherwise, return 0.
In this case, there is one stone left with a weight of 1.
So, the final output is: Weight of last stone: 1.

 */