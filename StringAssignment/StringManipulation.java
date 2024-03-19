import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: String to Integer Conversion
        System.out.print("Enter a string containing digits: ");
        String strDigits = scanner.nextLine();
        int convertedInt = Integer.parseInt(strDigits);
        System.out.println("Converted integer: " + convertedInt);

        // Task 2: String Tokenization
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Individual words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Task 3: Most Frequent Word
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        String mostFrequentWord = findMostFrequentWord(text);
        System.out.println("Most frequent word: " + mostFrequentWord);

        // Task 4: String Formatting
        System.out.print("Enter your full name (First Middle Last): ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split("\\s+");
        System.out.println("Formatted name: " + nameParts[2] + ", " + nameParts[0] + " " + nameParts[1]);

        // Task 5: String Encryption (Caesar Cipher)
        System.out.print("Enter a string to encrypt: ");
        String originalString = scanner.nextLine();
        String encryptedString = encryptString(originalString, 3); // Shifting by 3 positions
        System.out.println("Encrypted string: " + encryptedString);

        // Task 6: String Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenatedString);

        // Task 7: String Length
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int stringLength = inputString.length();
        System.out.println("Length of the string: " + stringLength);

        // Task 8: Substring Extraction
        System.out.print("Enter a string: ");
        String originalStr = scanner.nextLine();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        String extractedSubstring = originalStr.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + extractedSubstring);

        // Task 9: String Comparison
        System.out.print("Enter the first string: ");
        String strA = scanner.next();
        System.out.print("Enter the second string: ");
        String strB = scanner.next();
        boolean areEqual = strA.equals(strB);
        System.out.println("Strings are equal: " + areEqual);

        // Task 10: String Case Conversion
        System.out.print("Enter a string: ");
        String input = scanner.next();
        String uppercaseString = input.toUpperCase();
        String lowercaseString = input.toLowerCase();
        System.out.println("Uppercase: " + uppercaseString);
        System.out.println("Lowercase: " + lowercaseString);

        scanner.close();
    }

    // Method for Task 3: Most Frequent Word
    public static String findMostFrequentWord(String text) {
        String[] words = text.split("\\s+");
        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (String word : words) {
            int frequency = 0;
            for (String w : words) {
                if (word.equals(w)) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }

    // Method for Task 5: String Encryption (Caesar Cipher)
    public static String encryptString(String str, int shift) {
        StringBuilder encryptedString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((ch - 'a' + shift) % 26) + 'a');
                encryptedString.append(encryptedChar);
            } else {
                encryptedString.append(ch);
            }
        }
        return encryptedString.toString();
    }
}
