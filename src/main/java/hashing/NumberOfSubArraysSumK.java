package hashing;

import java.util.HashMap;

public class NumberOfSubArraysSumK {
    /*

    Question :- Given an unsorted array of integers, find the number of subarrays having a sum exactly equal to a given number k.

    Approach :-
    map <sum,index/length>
    1. calculate the sum with sum+=array[i]
    2. now calculate the x+y=kSum so x=ksum-x
        1. check if calculated above x is in the mapper if yes then get the length and add to current longest
        2. add sum to mapper->put sum,index

    this is similar to sum with zero in this case sum is k so we do x=k-y (LargestSubarraySumZero.java)

    Time complexity :-

    Space Complexity :-

    */

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 3, 4, 1, 4, 4, 4, 4};
        int k = 3;
        // hashmap stores particular value of sum.
        HashMap<Integer, Integer> mapper = new HashMap<>();
        mapper.put(0, 1);
        int longestLength = 0;

        // Sum of elements so far.
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {

            // Add current element to sum so far.
            currentSum += array[i];
            //calculate the sum that have to be removed so that we can get the desired sum
            int removeSum = currentSum - k;

            //get count of occurrences of that sum that have to removed and add it to res value
            if (mapper.containsKey(removeSum))
                longestLength += mapper.get(removeSum);

            // Add currsum value to count of different values of sum.
            mapper.put(currentSum, mapper.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println(" longest sub-array length with a sum equal to k Response - " + longestLength);

    }
}
