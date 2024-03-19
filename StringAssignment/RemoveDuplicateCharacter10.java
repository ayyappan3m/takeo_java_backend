import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter10 {

	public static void main(String[] args) {
		String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);

	}
	public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (charSet.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

}
