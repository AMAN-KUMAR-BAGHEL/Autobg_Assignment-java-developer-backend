public class FirstUniqueCharacter {

    public static Character findFirstNonRepeatingChar(String str) {
        // Check if the input string is null or empty.
        if (str == null || str.length() == 0) {
            return null; // Return null for empty or null strings.
        }

        // Create an array to store the character counts. We assume ASCII characters.
        int[] charCounts = new int[256]; // Assuming ASCII characters

        // Iterate through the string to count character occurrences.
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at the current index.
            charCounts[currentChar]++; // Increment the count for the current character.
        }

        // Iterate through the string again to find the first non-repeating character.
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at the current index.
            if (charCounts[currentChar] == 1) { // Check if the character count is 1.
                return currentChar; // Return the first non-repeating character.
            }
        }

        return null; // Return null if all characters repeat.
    }

    public static void main(String[] args) {
        // Create a simple buffer to read user input.
        byte[] inputBuffer = new byte[1024]; // Allocate buffer.
        int bytesRead = 0;

        try {
            // Read input from the standard input stream (keyboard).
            bytesRead = System.in.read(inputBuffer);
        } catch (java.io.IOException e) {
            // Handle input/output exception.
            System.out.println("Error reading input.");
            return;
        }

        // Convert the input buffer to a string.
        String inputString = new String(inputBuffer, 0, bytesRead - 1); // -1 to exclude newline char
        // Call the findFirstNonRepeatingChar function and print the result.
        Character result = findFirstNonRepeatingChar(inputString);
        System.out.println(result);
    }
}