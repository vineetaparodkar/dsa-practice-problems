package hashing;

import java.util.Arrays;

public class CSUMQ {
    /*

    Question :- William Macfarlane wants to look at an array.
    You are given a list of N numbers and Q queries. Each query is specified by two numbers i and j;
    the answer to each query is the sum of every number between the range [i, j] (inclusive).
    Note: the query ranges are specified using 0-based indexing.

    Approach :- we have to find the cumulative sum between the range i,j so we use the hashing array wherein we
    keep the prefix sum previous sum+ current value; incase the 1st element it will be 0 and in other cases it will
    be prefix[k-1].

    Now once we have the prefix array we have to subtract the left sums 0 to left-1 so that we will get the
    sum of left element as starting and not ferom previous 0th element.
    now we have to find the final sum so we deduct the left sum since last sum will be cumulative already containing the left

    Time complexity :- O(N)

    Space Complexity :- O(N)

    */

    public static void main(String[] args) {

        int[] array = new int[]{1, 4, 1};
        int left=1;
        int right=1;
        int[] prefixSum = new int[array.length+1];

        for(int k=0;k< array.length;k++){
            int sum= k==0? 0: prefixSum[k-1];
            prefixSum[k]=sum+array[k];
        }
        int leftSumValue = left!=0?prefixSum[left-1]:0;
        int sum = prefixSum[right]-leftSumValue;

        System.out.println("Cumulative sum from i= " +left+" & j= "+right+" sum="+sum);

    }
}
