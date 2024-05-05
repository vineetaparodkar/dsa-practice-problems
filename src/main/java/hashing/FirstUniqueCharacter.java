package hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    /*

    Question :- Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    Approach :- store character and its count in hashmap then iterate this map and return when you find count==1, return 1;

    Time complexity :- O(N*N)

    Space Complexity :- O(N)

    */

    public static void main(String[] args) {

        String s = "loveleetcode";
        Map<Character, Integer> mapper = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapper.put(s.charAt(i), mapper.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (mapper.get(s.charAt(i)) == 1) {
                System.out.println("Non repeating character index " + i);
                return;
            }
        }
        System.out.println("Non repeating character index " + -1);
    }
}
