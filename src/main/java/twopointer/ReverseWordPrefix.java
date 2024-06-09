package twopointer;


/*
Approach -
1. find index of 1st occurence
2. convert to charArray -- since it will be easier to swap, replace inbuild function wont work correctly since it replaces every occurence so cannot beused in swapping
3. use 2 pointer with i=0 and j=index and run while loop with i++;j-- and perform task of swapping
Complexity
        Time complexity: O(n)
        Space complexity: O(n)
*/

public class ReverseWordPrefix {

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index >= 0) {
            char[] chars = word.toCharArray();
            int i = 0;
            int j = index;
            while (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            return new String(chars);
        }
        return word;
    }

    public static void main(String[] args) {

        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
    }
}
