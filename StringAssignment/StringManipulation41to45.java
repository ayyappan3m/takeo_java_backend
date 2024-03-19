import java.util.concurrent.CompletableFuture;

public class StringManipulation41to45 {
    public static void main(String[] args) {
        // Task 41: Unicode Manipulation
        String unicodeString = "Hello \uD83D\uDC4B"; // "Hello 👋"
        System.out.println("Unicode String: " + unicodeString);
        System.out.println("Code Points Count: " + unicodeString.codePointCount(0, unicodeString.length()));

        // Task 42: String Interning and Memory Management
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("Are str1 and str2 the same object? " + (str1 == str2)); // true (interning)
        String str3 = new String("Hello");
        System.out.println("Are str1 and str3 the same object? " + (str1 == str3)); // false (not interned)

        // Task 43: String Compression (Huffman Coding)
        String originalString = "aaaaabbbbbbccccc";
        String compressedString = compressWithHuffman(originalString);
        System.out.println("Compressed String (Huffman): " + compressedString);

        // Task 44: Concurrent String Processing
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> processString("String 1"));
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> processString("String 2"));

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2);
        combinedFuture.thenRun(() -> System.out.println("All strings processed concurrently"));

        // Task 45: Custom String Class
        CustomString customString = new CustomString("Custom String Class");
        System.out.println("Uppercase: " + customString.toUpperCase());
        System.out.println("Substring(8, 14): " + customString.substring(8, 14));
    }

    // Task 43: String Compression (Huffman Coding)
    public static String compressWithHuffman(String str) {
        // Implement Huffman coding compression algorithm
        return "Compressed Huffman String";
    }

    // Task 44: Concurrent String Processing
    public static String processString(String str) {
        // Perform some processing on the string
        return "Processed " + str;
    }

    // Task 45: Custom String Class
    static class CustomString {
        private final String str;

        public CustomString(String str) {
            this.str = str;
        }

        public String toUpperCase() {
            return str.toUpperCase();
        }

        public String substring(int beginIndex, int endIndex) {
            return str.substring(beginIndex, endIndex);
        }
    }
}
