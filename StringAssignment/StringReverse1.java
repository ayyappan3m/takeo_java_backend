
public class StringReverse1 {

	public static void main(String[] args) {
		String word = "hello";
		String reverseWord = "";
		for(int i = 0; i < word.length();i++) {
			reverseWord += word.charAt(word.length()-1-i);
		}
		System.out.println(reverseWord);
	}

}
