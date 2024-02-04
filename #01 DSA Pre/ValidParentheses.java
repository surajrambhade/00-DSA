import java.util.Stack;

public class ValidParentheses {
  public static boolean isValidParenthesis(String s) {
    Stack<Character> st = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        st.push(')');
      } else if (c == '[') {
        st.push(']');
      } else if (c == '{') {
        st.push('}');
      } else if (st.empty() || st.pop() != c) {
        return false;
      }
    }
    return st.empty();
  }

  public static void main(String[] args) {

    String su = "][][]][][{{{}}}]";
    System.out.println(isValidParenthesis(su));
  }
}