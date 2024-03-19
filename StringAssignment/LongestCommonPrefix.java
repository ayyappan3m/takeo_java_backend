
public class LongestCommonPrefix {

	public static void main(String[] args) {
		 String[] strings = {"flower", "flow", "flight"};
	        String longestCommonPrefix = findLongestCommonPrefix(strings);
	        System.out.println("Longest common prefix: " + longestCommonPrefix);

	}
	public static String findLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String prefix = strings[0]; // Initialize prefix with the first string

        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Remove last character from prefix
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, return empty string
                }
            }
        }

        return prefix;
    }
}
