package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinimumOperationsHashing {
     /*

    Topic - Minimum operations to make all elements equal in an array.

    Question :- Given an array consisting of positive integers, return the minimum number of operations to make all the elements of the array equal.
    The operations can be addition, multiplication, division, or subtraction.

    Approach :- In order to make all the elements equal, we will be selecting a value from the array(the target element)
    and converting the rest of the elements into the selected element. The target element will be the element
    that has the highest frequency in the array. Let's say the element with the highest frequency occurs k times. Thus, we
    would require at least n-k operations for making all the array elements equal.

    Time complexity :- O(n)

    Space Complexity :- O(n)

    */

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,4};

        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], hashMap.getOrDefault(array[i], 0) + 1); //creating map for array with count
        }

        int highestFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > highestFrequency) {
                highestFrequency = currentFrequency;
            }
        }
        System.out.println("Least operations required are : "+(array.length-highestFrequency));

    }
}
