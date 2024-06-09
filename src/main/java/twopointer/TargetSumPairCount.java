package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*

Intuition
        Problem: You're given an array of integers and a target value. The task is to count the number of pairs of elements in the array such that the sum of the pair is less than the target value.
        The key insight for solving this problem is recognizing that if you have an array sorted in ascending order, you can efficiently find pairs that meet the given condition using a Two-Pointers Approach.

        Approach
        The Two-Pointers Approach is a common technique to solve problems involving arrays or sequences. In this case, you can use two pointers, often referred to as the "left" and "right" pointers, to traverse the array and find pairs that satisfy the given condition.

        Here's a high-level overview of the approach:

        1.) Sort the array in ascending order. Sorting helps in efficiently exploring pairs with sums less than the target value.

        2.) Initialize two pointers, left and right, pointing to the first and last elements of the sorted array, respectively.

        3.) Initialize a variable count to keep track of the count of valid pairs.
        While the left pointer is less than the right pointer:
        If the sum of the elements at left and right is less than the target value, it means all pairs with the current left element will also satisfy the condition. So, increment the count by right - left and move the left pointer to the right.
        If the sum is greater than or equal to the target, move the right pointer to the left.

        4.) Continue this process until the left pointer crosses the right pointer.

        Complexity
        Time complexity: O(nlogn)
*/


public class TargetSumPairCount {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort(Comparator.comparingInt(Integer::intValue));
        int i=0;
        int j=nums.size()-1;
        int count=0;

        while(i<j){
            if(nums.get(i)+nums.get(j)<target){
                count=count+(j-i);
                i++;
            }else{
                j--;
            }
        }
        return count;
    }

    public void main(String [] args){
        System.out.println(countPairs(new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1)), 2));
        System.out.println(countPairs(new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3)), -2));

    }
}
