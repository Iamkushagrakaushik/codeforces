import java.util.Scanner;

public class Anagram {

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = removeSpacesAndToLower(str1);
        str2 = removeSpacesAndToLower(str2);

        // If lengths are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count occurrences of characters
        int[] charCount = new int[26]; // For 26 lowercase letters

        // Increment the count for characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }

        // Decrement the count for characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        // If all values in charCount are zero, it's an anagram
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Helper function to remove spaces and convert to lowercase
    private static String removeSpacesAndToLower(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                // Convert to lowercase manually
                if (c >= 'A' && c <= 'Z') {
                    c = (char)(c + ('a' - 'A'));
                }
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings from the user
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }
}