
public class SubstringFrequency {

	public static void main(String[] args) {
		 String largerString = "hellohellohello";
	        String substring = "hello";
	        int frequency = countSubstringFrequency(largerString, substring);
	        System.out.println("Frequency of substring \"" + substring + "\": " + frequency);

	}
	public static int countSubstringFrequency(String largerString, String substring) {
        if (largerString == null || substring == null || largerString.isEmpty() || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = largerString.indexOf(substring);

        while (index != -1) {
            count++;
            index = largerString.indexOf(substring, index + 1);
        }

        return count;
    }

}
