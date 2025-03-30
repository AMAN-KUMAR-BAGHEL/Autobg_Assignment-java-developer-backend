public class ReverseWords {

    public static String reverseWords(String sentence) {
        // Check for null or empty input.
        if (sentence == null || sentence.length() == 0) {
            return ""; // Return empty string for null or empty input.
        }

        // Create a character array from the input sentence.
        char[] sentenceChars = sentence.toCharArray();
        int sentenceLength = sentenceChars.length;

        // Create an array to store the reversed sentence.
        char[] reversedChars = new char[sentenceLength];

        // Variables to keep track of word boundaries.
        int wordStart = sentenceLength; // Start from the end.
        int reversedIndex = 0;

        // Iterate through the sentence characters from the end.
        for (int i = sentenceLength - 1; i >= 0; i--) {
            if (sentenceChars[i] == ' ') { // Check for space (word boundary).
                // Copy the current word to the reversed array.
                for (int j = i + 1; j < wordStart; j++) {
                    reversedChars[reversedIndex++] = sentenceChars[j];
                }
                reversedChars[reversedIndex++] = ' '; // Add the space.
                wordStart = i; // Update the word start.
            }
        }

        // Copy the first word (if any).
        for (int j = 0; j < wordStart; j++) {
            reversedChars[reversedIndex++] = sentenceChars[j];
        }

        // Create a new String from the reversed character array.
        return new String(reversedChars, 0, reversedIndex);
    }

    public static void main(String[] args) {
        // Simple input read from standard input.
        byte[] inputBuffer = new byte[1024];
        int bytesRead = 0;

        try {
            bytesRead = System.in.read(inputBuffer);
        } catch (java.io.IOException e) {
            System.out.println("Error reading input.");
            return;
        }

        // Create string from input buffer. Remove trailing newline.
        String inputSentence = new String(inputBuffer, 0, bytesRead - 1);

        // Call the reverseWords function and print the result.
        String reversedSentence = reverseWords(inputSentence);
        System.out.println(reversedSentence);
    }
}