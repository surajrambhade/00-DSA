import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {
  public static void main(String[] args) {
    // Create a Hashtable to store key-value pairs where keys are strings and values are integers
    Hashtable<String, Integer> ht = new Hashtable<>();

    // Add entries to the Hashtable
    ht.put("Suraj", 23);
    ht.put("Sonali", 21);
    ht.put("Manjunath", 23);
    ht.put("Praksh", 58);
    ht.put("Chanda", 40);

    // Print the Hashtable (Note: The order may vary as Hashtable is not ordered)
    System.out.println(ht);

    // Iterate through the Hashtable using Map.Entry and print each key-value pair
    for (Map.Entry<String, Integer> entry : ht.entrySet()) {
      System.out.print("{ " + entry.getKey() + ": " + entry.getValue() + " } ");
    }
  }
}
