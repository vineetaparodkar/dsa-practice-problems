package twopointer;

public class FirstPallindromicString {

    public static String firstPalindrome(String[] words) {

        for (int k = 0; k < words.length; k++) {
            char[] charArray = words[k].toCharArray();
            int i = 0;
            int j = charArray.length - 1;
            while (i < j) {
                if (charArray[i] != charArray[j]) {
                    break;
                }
                j--;
                i++;
            }
            if (i >= j) {
                return words[k];
            }
        }

        return "";
    }

    public static void main(String[] args) {

        System.out.println(firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
        System.out.println(firstPalindrome(new String[]{"notapalindrome", "racecar"}));
        System.out.println(firstPalindrome(new String[]{"def","ghi"}));
    }
}
