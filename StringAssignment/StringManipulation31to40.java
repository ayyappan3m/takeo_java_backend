import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation31to40 {
    public static void main(String[] args) {
        // Task 1: Regular Expression Validation
        String email = "test@example.com";
        String phoneNumber = "123-456-7890";

        boolean isEmailValid = validateEmail(email);
        System.out.println("Is email valid? " + isEmailValid);

        boolean isPhoneNumberValid = validatePhoneNumber(phoneNumber);
        System.out.println("Is phone number valid? " + isPhoneNumberValid);

        // Task 2: Levenshtein Distance Calculation
        String str1 = "kitten";
        String str2 = "sitting";

        int levenshteinDistance = calculateLevenshteinDistance(str1, str2);
        System.out.println("Levenshtein Distance between \"" + str1 + "\" and \"" + str2 + "\": " + levenshteinDistance);

        // Task 3: Longest Palindromic Substring
        String inputString = "babad";
        String longestPalindromicSubstring = findLongestPalindromicSubstring(inputString);
        System.out.println("Longest palindromic substring in \"" + inputString + "\": " + longestPalindromicSubstring);

        // Task 4: String Permutations
        String input = "abc";
        System.out.println("Permutations of \"" + input + "\":");
        generatePermutations(input, "");

        // Task 5: Rabin-Karp Substring Search
        String text = "abcbabcbabc";
        String pattern = "babc";
        System.out.println("Indices of pattern \"" + pattern + "\" in text \"" + text + "\":");
        rabinKarpSearch(text, pattern);

        // Task 6: String Compression (Run-length Encoding)
        String uncompressedString = "AAAABBBCCDAA";
        String compressedString = compressString(uncompressedString);
        System.out.println("Compressed string: " + compressedString);

        // Task 7: Edit Distance and Alignment
        String strA = "kitten";
        String strB = "sitting";
        int editDistance = calculateEditDistance(strA, strB);
        System.out.println("Edit distance between \"" + strA + "\" and \"" + strB + "\": " + editDistance);

        // Task 8: Longest Common Subsequence
        String seqA = "AGGTAB";
        String seqB = "GXTXAYB";
        String longestCommonSubsequence = findLongestCommonSubsequence(seqA, seqB);
        System.out.println("Longest common subsequence between \"" + seqA + "\" and \"" + seqB + "\": " + longestCommonSubsequence);

        // Task 9: String Matching Algorithms
        String textToSearch = "AABAACAADAABAABA";
        String patternToSearch = "AABA";
        System.out.println("Indices of pattern \"" + patternToSearch + "\" in text \"" + textToSearch + "\":");
        kmpSearch(textToSearch, patternToSearch);

        // Task 10: Regular Expression Replacement
        String originalString = "Hello, World!";
        String replacedString = originalString.replaceAll("[aeiou]", "*");
        System.out.println("Replaced string: " + replacedString);
    }

    // Task 1: Regular Expression Validation
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\d{3}-\\d{3}-\\d{4}$";
        return phoneNumber.matches(phoneRegex);
    }

    // Task 2: Levenshtein Distance Calculation
    public static int calculateLevenshteinDistance(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        return dp[str1.length()][str2.length()];
    }

    // Task 3: Longest Palindromic Substring
    public static String findLongestPalindromicSubstring(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Task 4: String Permutations
    public static void generatePermutations(String input, String permutation) {
        if (input.isEmpty()) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < input.length(); i++) {
                generatePermutations(input.substring(0, i) + input.substring(i + 1), permutation + input.charAt(i));
            }
        }
    }

    // Task 5: Rabin-Karp Substring Search
    public static void rabinKarpSearch(String text, String pattern) {
        int prime = 101;
        int d = 256;
        int patternHash = 0; // hash value for pattern
        int textHash = 0; // hash value for text
        int h = 1;

        for (int i = 0; i < pattern.length() - 1; i++)
            h = (h * d) % prime;

        for (int i = 0; i < pattern.length(); i++) {
            patternHash = (d * patternHash + pattern.charAt(i)) % prime;
            textHash = (d * textHash + text.charAt(i)) % prime;
        }

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (patternHash == textHash) {
                boolean flag = true;
                for (int j = 0; j < pattern.length(); j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.print(i + " ");
            }
            if (i < text.length() - pattern.length()) {
                textHash = (d * (textHash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % prime;
                if (textHash < 0)
                    textHash += prime;
            }
        }
    }

    // Task 6: String Compression (Run-length Encoding)
    public static String compressString(String uncompressedString) {
        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 0; i < uncompressedString.length(); i++) {
            if (i < uncompressedString.length() - 1 && uncompressedString.charAt(i) == uncompressedString.charAt(i + 1)) {
                count++;
            } else {
                compressedString.append(uncompressedString.charAt(i));
                compressedString.append(count);
                count = 1;
            }
        }

        return compressedString.toString();
    }

    // Task 7: Edit Distance and Alignment (Dynamic Programming)
    public static int calculateEditDistance(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0)
                    dp[i][j] = j;
                else if (j == 0)
                    dp[i][j] = i;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        return dp[str1.length()][str2.length()];
    }

    // Task 8: Longest Common Subsequence (Dynamic Programming)
    public static String findLongestCommonSubsequence(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        int index = dp[str1.length()][str2.length()];
        char[] lcs = new char[index];
        int i = str1.length(), j = str2.length();
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs[index - 1] = str1.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (dp[i - 1][j] > dp[i][j - 1])
                i--;
            else
                j--;
        }

        return new String(lcs);
    }

    // Task 9: String Matching Algorithms
    public static void kmpSearch(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        int i = 0, j = 0;
        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    private static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0, i = 1;
        lps[0] = 0;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Task 10: Regular Expression Replacement
    public static String replaceWithRegex(String originalString, String regexPattern, String replacement) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(originalString);
        return matcher.replaceAll(replacement);
    }
}
