package hashing;

import java.util.HashMap;

public class NumberOfSubArrayAbsoluteDifference {
    /*

    Question :- Given an integer array nums and an integer k,
    return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

    Approach :- in this question we do not precompute the hashmap and then query but create it on the go
    so we have 2 conditions i-k and i+k we get the count of this values from map and also put the current index and increment count by1

    Time complexity :-

    Space Complexity :-

    */

    public static void main(String[] args) {
        // hashmap stores particular value of sum.
        int[] nums = new int[]{1, 3, 3, 4, 1, 4, 4, 4, 4};
        int k = 1;

        HashMap<Integer, Integer> frequencyMapper = new HashMap<Integer, Integer>();
        int count = 0;

        for (int i : nums) {
            count += frequencyMapper.getOrDefault(i - k, 0) + frequencyMapper.getOrDefault(i + k, 0);
            frequencyMapper.put(i, frequencyMapper.getOrDefault(i, 0) + 1);
        }
        System.out.println("Count response " + count);

    }
}
