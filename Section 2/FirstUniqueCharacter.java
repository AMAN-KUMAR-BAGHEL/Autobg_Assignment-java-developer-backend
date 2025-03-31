// Backend Assignment
// Section 2: Coding Problems 
// 4. Find the First Non-Repeating Character in a String 
// Write a Java function that takes a string as input and returns the first non-repeating character. If all characters repeat, return null 
public class FirstUniqueCharacter {

    // Method to find the first non-repeating character in a string
    public static Character findFirstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) { // Iterate through each character
            boolean unique = true; // Assume character is unique initially

            for (int j = 0; j < str.length(); j++) { // Compare with every other character
                if (i != j && str.charAt(i) == str.charAt(j)) { // If match found
                    unique = false; // Mark as not unique
                    break; // No need to check further
                }
            }

            if (unique) { // If character remains unique, return it
                return str.charAt(i);
            }
        }
        return null; // Return null if no unique character is found
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("swiss")); // Output: 'w'
    }
}
