public class DSA_11_Rever_Arrya_String {
  public static boolean isPalindrome(String str) {

    char[] charArray = str.toCharArray();
    int n = charArray.length;
    for (int i = 0; i < n / 2; i++) {
      if (charArray[i] != charArray[n - 1 - i]) {
        // If characters don't match, it's not a palindrome
        return false;
      }
    }
    // If all characters match, it's a palindrome
    return true;
  }

  public static void main(String[] args) {
    // Example usage:
    String input = "madam";

    // Check if the string is a palindrome
    boolean result = isPalindrome(input);

    // Print the result
    System.out.println("Is Palindrome: " + result);
  }
}
