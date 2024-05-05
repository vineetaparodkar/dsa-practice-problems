package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ArrayDuplicateSubsetHashMap {
    /*

   Topic - Check if the given array is subset of another array

   Question :- Given two arrays, arr1 and arr2, check if arr2 is a subset of arr1.
   You can assume there are duplicates in both the arrays.

   Approach :- Note there are duplicates this time. We can create a HashMap and store all the numbers in arr1 as
   keys and their frequencies as value.
   Then we can iterate over arr2 and check if that number exists in our hashmap or not. If the element is present in hashmap
   and the frequency is greater than 0 we simply subtract 1 from the frequency and move further. If that number doesn't exist or
   it's frequency is 0 then we can return false stating this element doesn't exist in arr1 or its frequency in arr1 is less than
   its frequency in arr2. If we've iterated over all the elements of arr2 we can then return true.

   Time complexity :- O(n+m), where n and m are sizes of arr1 and arr2 respectively.

   Space Complexity :-O(n)

   */
    public static void main(String[] args) {

        int[] arrayOne = new int[]{2, 4, 7, 1, 5, 5};
        int[] arrayTwo = new int[]{5, 4, 2};

        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < arrayOne.length; i++) {
            hashMap.put(arrayOne[i], hashMap.getOrDefault(arrayOne[i], 0) + 1); //creating map for array1 with count
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            if (hashMap.getOrDefault(arrayTwo[i], 0) > 0) { //if count is higher then 0 then decrement count saying this has been visited once
                hashMap.put(arrayTwo[i], hashMap.getOrDefault(arrayTwo[i], 0) + 1);
            }
            if (hashMap.getOrDefault(arrayTwo[i], 0) == 0) { //if count is 0 which means it was not present in array1 so directly break since no ponint in further checking the value
                //this will handle 2 conditions
                //condition1 : if element of array2 is not there in array1 then count will be 0
                //confition2 : if there are more number of elements like 5, 5 times in array2 (4times in array1) then after decrementing each time in
                //map final count will be 0 now when iterating for 5th time count have already been 0 in that case it will come here and
                // exit
                System.out.println("Array2 is not subset of array1");
                return;
            }
        }
        System.out.println("Array2 is subset of array1");
        return;
    }
}
