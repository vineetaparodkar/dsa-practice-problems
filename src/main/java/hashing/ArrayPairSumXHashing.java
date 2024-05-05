package hashing;

import java.util.HashSet;

public class ArrayPairSumXHashing {
    /*

   Topic : - Find out the pair from array whose sum forms the number 'x' when both the numbers of the pair are added

   Question :- Given an array arr1 and number 'x', To find if a pair exists in arr1 which can be added to make number 'x'.

   Approach :- So basically, we will use a single 'for' loop in which for iteration we will take the difference of 'x' and 'arr[i]'
   and check if that difference value is present in the set . We are using set(unordered_set) as HashTable in this problem.
   we take the difference becoz of following logic
   pairs(x,y)
   x+y=totalsum
   we are given totalsum value we need to find x & y
   since we can consider y to be current element array[i] and then we have to find x then moving y on RHS
   x=totalsum-x;

   Time complexity :- O(N)

   Space Complexity :- O(N)

   */
    public static void main(String[] args) {

        int[] array = new int[]{0, -1, 2, -3, 1};
        int x=-2;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            final int abs = x - array[i];
            if(set.contains(abs)){
                System.out.println("Pairs found");
                System.out.println("(" + array[i] + "," + abs +")");
                System.out.println("(" + abs + "," + array[i]+")");
                return;
            }else {
                set.add(array[i]); //creating set for array
            }
        }
        System.out.println("No pairs found");
    }
}
