/*
1. Create a Character Stack .
2. Convert String into Char arr.
3. For Loop to push each element of char to Stack.
4. Pop element from stack till the stack is empty, Store them in the Character Array. 
5. Convert the char arr to string.
*/
import java.util.Stack;

public class Reverse_String {

  public static String reverse(String str) {
    Stack<Character> chr = new Stack<Character>();
    char[] arr = str.toCharArray();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      chr.push(arr[i]);
    }
    for (int i = 0; i < n; i++) {
      arr[i] = chr.pop();
    }
    return String.valueOf(arr);
  }

  public static void main(String[] args) {
    System.out.println(reverse("Suraj rambhade"));
  }
}
