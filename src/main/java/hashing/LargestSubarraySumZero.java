package hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarraySumZero {
    /*

    Question :- Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.

    Approach :-
    1. calculate the sum with sum+=array[i]
    2. if sum is zero then longest length with sum=0 will be current element index+1 since zero indexing
    3. in case sum is not zero we will do following
        1. map contains the key which is newly calculated sum -> longestLength = Math.max(longestLength, i - mapper.get(sum));
        we do i - mapper.get(sum) since the distance or length will be equivalent to previsiouly discovered sum position - newly
        same value sum position discovered for same value of sum
        2. map doesn't contain the sum its newly discovered sum ->put sum,index

    Time complexity :-

    Space Complexity :-

    */

    public static void main(String[] args) {

        int sum = 0;
        int longestLength = 0;
        int[] array = new int[]{2, 4, 7, 1, 5, 5};


        Map<Integer, Integer> mapper = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum == 0)
                longestLength = i + 1; //if sum is zero then longest length with sum=0 will be current element index+1 since zero indexing
            else {
                if (mapper.containsKey(sum)) {
                    longestLength = Math.max(longestLength, i - mapper.get(sum));
                } else {
                    mapper.put(sum, i);
                }
            }
        }
        System.out.println("Largest length " + longestLength);
    }
}
