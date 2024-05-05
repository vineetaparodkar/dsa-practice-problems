package hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxDistance {
    /*

    Question :- Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.

    Approach :- Algorithm is to store the value,index if value of array is not found otherwise get the index of already
    stored index then check max of current index and stored index and store/update the max value (i - mapper.get(array[i])) which
    is the distance between first occurence of that number and the current number.

    Time complexity :- O(N)

    Space Complexity :- O(N)

    */

    public static void main(String[] args) {

        int[] array = new int[]{0, -1, 2, -3, 1};
        int maxDistance = Integer.MIN_VALUE;
        Map<Integer,Integer> mapper = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!mapper.containsKey(array[i]))
                mapper.put(array[i], i);
                // Else update max distance
            else
                maxDistance = Math.max(maxDistance, i - mapper.get(array[i]));
        }
        System.out.println("Max distance "+maxDistance);

    }
}
