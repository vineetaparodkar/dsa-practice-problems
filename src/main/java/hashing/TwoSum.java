package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*

    Question :- https://leetcode.com/problems/two-sum/description/
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Approach :- So basically, we will use a single 'for' loop in which for iteration we will take the difference of 'x' and 'arr[i]'
       and check if that difference value is present in the set . We are using set(unordered_map) as HashMap in this problem. Map
       will be holding the value and its index in array in map
       we take the difference becoz of following logic.
       pairs(x,y)
       x+y=totalsum
       we are given totalsum value we need to find x & y
       since we can consider y to be current element array[i] and then we have to find x then moving y on RHS
       x=totalsum-x;

       we are using map here becoz we need index too, but incase index not required just the values are required in that case we
       can go for hashset refer ArrayPairSumXHashing.java program file

       Time complexity :- O(N)

       Space Complexity :- O(N)
    */

    public static void main(String[] args) {

        int[] array = new int[]{2,7,11,15};
        int x=9;
        HashMap<Integer,Integer> mapper = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            final int abs = x - array[i];
            if(mapper.containsKey(abs)){
                System.out.println("Pairs found");
                System.out.println(Arrays.toString(new int[]{mapper.get(abs),i})); //since its non repeating and exactly1 solution so we can return after finding 1st pair by looking up in hashmap
                return;
            }else {
                mapper.put(array[i],i); //creating map for array value and its index
            }
        }
        System.out.println("No pairs found");
    }
}
