import java.util.Scanner;

public class StringManipulation20TO30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Trimming Whitespace
        System.out.print("Enter a string with leading and trailing whitespace: ");
        String strWithWhitespace = scanner.nextLine();
        String trimmedString = strWithWhitespace.trim();
        System.out.println("Trimmed string: \"" + trimmedString + "\"");

        // Task 2: Finding Characters
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to find its index: ");
        char targetChar = scanner.next().charAt(0);
        int charIndex = inputString.indexOf(targetChar);
        System.out.println("Index of '" + targetChar + "' in the string: " + charIndex);

        // Task 3: Replacing Characters
        System.out.print("Enter a string: ");
        String originalStr = scanner.next();
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);
        String replacedStr = originalStr.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replacedStr);

        // Task 4: String Splitting
        System.out.print("Enter a string to split: ");
        scanner.nextLine(); // Consume newline character
        String inputLine = scanner.nextLine();
        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();
        String[] splitStrings = inputLine.split(delimiter);
        System.out.println("Split strings:");
        for (String splitStr : splitStrings) {
            System.out.println(splitStr);
        }

        // Task 5: Counting Occurrences
        System.out.print("Enter a string: ");
        String strToCount = scanner.nextLine();
        System.out.print("Enter a character to count its occurrences: ");
        char targetCharCount = scanner.next().charAt(0);
        long countOccurrences = strToCount.chars().filter(ch -> ch == targetCharCount).count();
        System.out.println("Occurrences of '" + targetCharCount + "': " + countOccurrences);

        // Task 6: String Formatting
        String firstName = "John";
        String lastName = "Doe";
        String formattedMessage = String.format("Hello, %s %s!", firstName, lastName);
        System.out.println(formattedMessage);

        // Task 7: String Conversion
        int number = 123;
        String strNumber = Integer.toString(number);
        System.out.println("Converted string: " + strNumber);

        // Task 8: Substring Check
        System.out.print("Enter a larger string: ");
        String largerString = scanner.next();
        System.out.print("Enter a substring to check its existence: ");
        String substringToCheck = scanner.next();
        boolean containsSubstring = largerString.contains(substringToCheck);
        System.out.println("Substring exists within the larger string: " + containsSubstring);

        // Task 9: String Empty Check
        System.out.print("Enter a string to check if it's empty: ");
        String strToCheck = scanner.next();
        boolean isEmpty = strToCheck.isEmpty();
        System.out.println("String is empty: " + isEmpty);

        // Task 10: String Concatenation with Other Types
        int num = 5;
        String concatenatedString = "The number is " + num;
        System.out.println(concatenatedString);

        scanner.close();
    }
}
