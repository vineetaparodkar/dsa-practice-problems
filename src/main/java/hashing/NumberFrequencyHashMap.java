package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class NumberFrequencyHashMap {
    /*

     Question :- You are given an array of size “n” ; you are also given “Q” queries for each of the
                 query please tell how many times a given number occurs in the array. Use Hashmap approach.

     Approach :- hashmap holds the count and actual value and does not create the indexes for all the indexes.

     Time complexity :- Insertion operation in a Hashmap has average O(1) time complexity and printing hashmap[i]
     also takes O(1) time on average.

     Space Complexity :- O(N) space in the worst case

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{2,3,3,5,2,5,5,5,5};
        int arraySize = array.length;
        HashMap<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < arraySize; i++) {
            int input = array[i];
            mapper.put(input, mapper.getOrDefault(input, 0)+1);
        }

        int querySize = scanner.nextInt();

        for (int i = 0; i < querySize; i++) {
            int query = scanner.nextInt();
            System.out.println(" Query " + query + " count " + mapper.getOrDefault(query, 0));
        }
    }
}
