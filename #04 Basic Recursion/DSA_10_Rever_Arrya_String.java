public class DSA_10_Rever_Arrya_String {
  public static boolean isStringArrayPalindrome(int n, String[] strings) {
      return checkStringArrayPalindrome(strings, 0, n - 1);
  }

  private static boolean checkStringArrayPalindrome(String[] strings, int start, int end) {
      if (start >= end) {
          return true;
      } else {
          return strings[start].equals(strings[end]) && checkStringArrayPalindrome(strings, start + 1, end - 1);
      }
  }

  public static void main(String[] args) {
      String[] arr = {"apple", "banana", "orange", "banana", "apple"};

      // Check if the array is a palindrome
      boolean isPalindrome = isStringArrayPalindrome(arr.length, arr);

      // Print the array
      System.out.println("Array:");
      for (String s : arr) {
          System.out.print(s + " ");
      }

      // Print the result
      System.out.println("\nIs Palindrome? " + isPalindrome);
  }
}
