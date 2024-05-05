package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {
    /*

    Question :- Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.

    Approach :-
    step1: iterate array and put the element in the present map marking it as true
    step2:  check if current eleement is already been checked/visited  && check if this element doesnot have prior starting sequence
    ie !present.containsKey(nums[i]-1)
    now that we have the starting sequence initialize to  int start=nums[i];
    and run while loop keep incrementing start sequence and put in checked mapper while loop should run uptil the start which
    we are incrementing is found in the present map

    once this is done check for Math.max(currentLongest, count) the count is calculated inside the while loop above which keeps
    count of longest sequence acheived by incrementing start

    Time complexity :-

    Space Complexity :-

    */
    public static void main(String[] args) {

        int[] nums = new int[]{0, -1, 2, -3, 1};
        int longestConsecutiveSequence=0;

        Map<Integer,Boolean> checked = new HashMap<>();
        Map<Integer,Boolean> present = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            present.put(nums[i],true);
        }

        for(int i=0;i<nums.length;i++){

            if(!checked.containsKey(nums[i]) && !present.containsKey(nums[i]-1)){
                int count=0;
                checked.put(nums[i],true);
                int start=nums[i];
                while(present.containsKey(start)){
                    start++;
                    checked.put(start,true);
                    count++;
                }
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence,count);
            }
        }

        System.out.println("Longest consecutive sequence "+longestConsecutiveSequence);
    }
}
