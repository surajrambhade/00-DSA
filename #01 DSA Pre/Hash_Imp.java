class llNOde {
  int key;
  int value;
  llNOde next;

  // Constructor to initialize a linked list node with key and value
  public llNOde(int key, int value) {
    this.key = key;
    this.value = value;
  }
}

class hTable {
  int n; // size of table array
  int size; // how many elements are inserted
  llNOde table[];

  // Constructor to initialize the hash table with default values
  public hTable() {
    n = 1;
    table = new llNOde[n];
    size = 0;
  }

  // Hash function to determine the index where a key should be stored
  private int hFun(int key) {
    return ((key + 1) / 2) % n;
  }

  // Function to resize the hash table when load factor exceeds 0.7
  private void reform() {
    int oldTableSize = n;
    llNOde oldTable[] = table;
    n = oldTableSize * 2;
    table = new llNOde[n];
    size = 0;

    // Insert old table elements into the new table
    for (int i = 0; i < oldTableSize; i++) {
      llNOde head = oldTable[i];
      while (head != null) {
        this.insert(head.key, head.value);
        head = head.next;
      }
    }
  }

  // Function to insert a key-value pair into the hash table
  public void insert(int key, int value) {
    int index = hFun(key);
    if (table[index] == null) {
      // If the bucket is empty, create a new node and set it as the head
      llNOde temp = new llNOde(key, value);
      table[index] = temp;
    } else {
      // If the bucket is not empty, traverse the linked list to find the key
      llNOde head = table[index];
      llNOde prev = null;
      while (head != null) {
        if (head.key == key) {
          // If the key already exists, update its value
          head.value = value;
          return;
        }
        prev = head;
        head = head.next;
      }
      // If the key is not found, create a new node and add it to the end of the list
      llNOde temp = new llNOde(key, value);
      prev.next = temp;
    }
    size++;

    // Check if reform is needed based on the load factor
    if (size / n >= 0.7) {
      reform();
    }
  }
}

public class Hash_Imp {
  public static void main(String[] args) {
    // Create a new hash table
    hTable h = new hTable();
    System.out.println("Current Size Of Table Array Before: " + h.size);

    // Insert key-value pairs into the hash table
    h.insert(2, 1);
    h.insert(4, 1);
    h.insert(5, 1);
    h.insert(3, 1);
    h.insert(3, 4);

    h.insert(6, 1);
    h.insert(4, 1);
    h.insert(5, 6);
    h.insert(8, 1);
    h.insert(4, 4);

    h.insert(7, 1);
    h.insert(4, 5);
    h.insert(5, 4);
    h.insert(10, 2);
    h.insert(3, 4);

    // Display the contents of the hash table
    System.out.println("Current Size Of Table Array: " + h.n);
    for (int i = 0; i < h.n; i++) {
      llNOde head = h.table[i];
      while (head != null) {
        System.out.println(head.key + " " + head.value);
        head = head.next;
      }
      System.out.println();
    }

    // Display the final size of the hash table
    System.out.println("Current Size Of Table Array After: " + h.size);
  }
}
