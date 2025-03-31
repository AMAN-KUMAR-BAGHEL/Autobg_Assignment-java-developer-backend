// Backend Assignment
// Section 2: Coding Problems 
// 5. Reverse Words in a Sentence 
// Write a Java function that takes a sentence as input and reverses the order of words whilebkeeping the characters in each word unchanged. 
// Example 
// Input: "Java is awesome" 
// Output: "awesome is Java" 
// Constraints: 
// • You cannot use built-in functions like Collections.reverse(). 
// • Preserve spaces between words as in the input.
public class ReverseWords {
    public static String reverseWords(String sentence) {
        // Check if the sentence is null or empty.
        if (sentence == null || sentence.isEmpty()) {
            return sentence; // Return the original sentence if it's null or empty.
        }

        // Split the sentence into an array of words using spaces as delimiters.
        String[] words = sentence.split(" ");

        // Create a StringBuilder to build the reversed sentence.
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through the words array in reverse order.
        for (int i = words.length - 1; i >= 0; i--) {
            // Append the current word to the reversed sentence.
            reversedSentence.append(words[i]);

            // Append a space if it's not the last word.
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        // Convert the StringBuilder to a String and return it.
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        // Call the reverseWords function with the input sentence and print the result.
        System.out.println(reverseWords("Java is awesome")); // Output: "awesome is Java"
    }
}