public class DSA_01_High_Low_Freq_Element {
  public static int[] getFrequencies(int[] v) {

      int maxNum = Integer.MIN_VALUE; // To track the maximum number in the array
      int minNum = Integer.MAX_VALUE; // To track the minimum number in the array

      // Iterate through the array to find the maximum and minimum numbers
      for (int num : v) {
          maxNum = Math.max(maxNum, num);
          minNum = Math.min(minNum, num);
      }

      int[] frequencyArray = new int[maxNum + 1]; // Array to store frequencies, index represents the number

      // Iterate through the array to count the frequency of each element
      for (int num : v) {
          frequencyArray[num]++;
      }

      int maxFrequency = Integer.MIN_VALUE; // To track the maximum frequency
      int minFrequency = Integer.MAX_VALUE; // To track the minimum frequency
      int maxFrequencyElement = 0; // To store the element with the maximum frequency
      int minFrequencyElement = 0; // To store the element with the minimum frequency

      // Iterate through the frequency array to find the maximum and minimum
      // frequencies
      for (int i = minNum; i <= maxNum; i++) {
          int frequency = frequencyArray[i];

          // Update max frequency details
          if (frequency > maxFrequency) {
              maxFrequency = frequency;
              maxFrequencyElement = i;
          }

          // Update min frequency details
          if (frequency > 0 && frequency < minFrequency) {
              minFrequency = frequency;
              minFrequencyElement = i;
          }
      }

      return new int[] { maxFrequencyElement, minFrequencyElement };
  }
}

