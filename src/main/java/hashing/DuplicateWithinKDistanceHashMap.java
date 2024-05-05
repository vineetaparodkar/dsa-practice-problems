package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateWithinKDistanceHashMap {

    /*

    Question :- Check if the following given array contains duplicate elements within k distance from each other.
    Given an unsorted array that may contain duplicates. Also given a number k which is smaller than the size of
    the array, returns true if the array contains duplicates within k distance.


    Approach :-
    While traversing an array from left to right we need to consider two situations.

    1]   If the array element is already present in our map then get its position from a map and
    calculate the difference between the current index and the position that we have fetched from the map.

        -> if the difference is greater than k then update the position of the current element in the map

        -> if the difference is less than k then simply return true.

    2]   If the array element is not present in our map then just insert it with its index.

    Time complexity :- O(N)

    Space Complexity :- O(N)

    */
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,1};
        int kDistance = 3;

        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                if (hashMap.get(array[i]) - i <= kDistance) {
                    System.out.println("contains duplicate elements within k distance " + kDistance);
                    return;
                } else {
                    hashMap.put(array[i], i); //updating map for array1 with index since older index doesnt have anything repeating within k
                }
            } else {
                hashMap.put(array[i], i); //creating map for array1 with index
            }
        }
        System.out.println("Does not contain duplicate elements within k distance "+kDistance);
    }
}
