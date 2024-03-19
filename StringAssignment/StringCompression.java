
public class StringCompression {
	static int counter = 0;
	static void updateCharacterAndCount(char characters[], int count[], char character) {
		boolean updated = false;
		for(int i=0;i<=counter;i++) {
			if(characters[i] == character) {
				count[i] = ++count[i];
				updated = true;
			}
		}
		if(!updated) {
			characters[counter] = character;
			count[counter++] = 1;
		}
		
	}
	public static void main(String[] args) {
		String text = "welcomee hello world";
		char characters[] = new char[text.length()];
		int count[] = new int[text.length()];
		
		for(int i = 0; i< text.length();i++) {
			updateCharacterAndCount(characters, count, text.charAt(i));
		}
		String compressedString = "";
		for(int i = 0; i<= counter;i++) {
			compressedString += characters[i]+String.valueOf(count[i]);
		}
		System.out.println(compressedString);
	}

}
