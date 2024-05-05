package hashing;

import java.util.HashSet;
import java.util.Set;

public class ArraySubsetHashSet {

    /*

   Topic - Check if the given array is subset of another array

   Question :- Given two arrays, arr1 and arr2, check if arr2 is a subset of arr1.
   You can assume there are no duplicates in both the arrays.

   Approach :- Note there are no duplicates. The extra work we are doing in naive approach is iterating arr1 every time for each
   element of arr2. Instead of iterating everytime, we can use a hashset , store all integers from arr1 in the hashset
   and check directly whether the element is present or not in arr1. We are assuming here that there are
   no duplicates in the arrays. If duplicates were present, we could have used hashmap instead of hashset.

   Time complexity :- O(n+m), as we traverse both array once.

   Space Complexity :-O(n) , as there are only n elements inserted in the hashset so it takes O(n) space

   */
    public static void main(String[] args) {

        int[] arrayOne = new int[]{1, 3, 4, 8, 11, 12};
        int[] arrayTwo = new int[]{1, 3, 4};

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arrayOne.length;i++){
            set.add(arrayOne[i]);
        }

        for(int i=0;i<arrayTwo.length;i++){
            if(!set.contains(arrayTwo[i])){
                System.out.println("Array2 is not subset of Array1");
                return;
            };
        }
        System.out.println("Array2 is subset of Array1");
    }
}
