package hashing;

import java.util.HashMap;

public class NumberFrequency {
    /*

    Question :- You are given an array of size “n” ; you are also given “Q” queries for each of the
    query please tell how many times a given number occurs in the array. Use Hasharray approach.

    Approach :- hashmap holds the count and actual value and does not create the indexes for all the indexes.

     Time complexity :- Insertion operation in a Hashmap has average O(1) time complexity and printing hashmap[i]
     also takes O(1) time on average.

     Space Complexity :- O(N) space in the worst case

    */

    public static void main(String[] args) {

        int[] array = new int[]{0, 5, 5, 5, 4};
        int arraySize = array.length;
        HashMap<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < arraySize; i++) {
            int input = array[i];
            mapper.put(input, i);
        }

        int query = 5;
        System.out.println(" Query " + query + " index " + mapper.getOrDefault(query, -1));
    }
}
