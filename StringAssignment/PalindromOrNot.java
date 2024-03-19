
public class PalindromOrNot {

	public static void main(String[] args) {
		String word = "helleh";
		boolean isPalindrom = true;
		for(int i = 0; i < word.length();i++) {
			if(word.charAt(i) != word.charAt(word.length()-1-i)) {
				isPalindrom = false;
				break;
			}
		}
		if(isPalindrom) {
			System.out.println(word+" is palindrom");
		} else {
			System.out.println(word+" is not a palindrom");
		}
	}

}
