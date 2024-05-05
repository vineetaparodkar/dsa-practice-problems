package hashing;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraysXORK {
    /*

    Question :- Given an array of integers arr[] and a number m, count the number of subarrays having XOR of their elements as m.

    Approach :- we use xor propeties similar to x+y=k then we do x=k-y similarly we do c ^ array[i] ^ k

    properties we used:
    a^b=m ==> a^m=b ==>b^m=a

    here a is arr sum from 0->i (sum seen so far)
    here b is arr sum of remaining elements say i+1->n (unknown sum future) which is like j

    so we are saying xor of all elements is equal to m
    so its like (0->i) ^ (i+1->n) = m this resembles the 1st property a^b=m
    now using 2nd property (0->i) ^ m = (i+1->n) so its like we are searching for b which is unkonwn future sum i.e.(i+1->n)

    Time complexity :-

    Space Complexity :-

    */

    public static void main(String[] args) {
        // hashmap stores particular value of sum.
        int[] array = new int[]{1,3,3,4,1,4,4,4,4};
        int m=2;
        Map<Long, Long> mapper = new HashMap<>();
        mapper.put(0L, 1L);
        long c = 0; //this will be like cumulative so far seen sum except this time its so far seen xor c ^ cuureentElement
        long count = 0;
        int i = 1;

        while (i <= array.length) {
            c = c ^ array[i]; //this will be like cumulative so far seen sum except this time its so far seen xor c ^ cuureentElement
            long value = c ^ m; //this is using property 2 of xor defined above
            count = count + mapper.getOrDefault(value, 0L);
            mapper.put(c, mapper.getOrDefault(c, 0L) + 1);
            i++;
        }

    }

}
