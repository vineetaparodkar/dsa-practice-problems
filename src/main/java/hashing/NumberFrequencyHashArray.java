package hashing;

import java.util.Scanner;

public class NumberFrequencyHashArray {

    /*

    Question :- We are given an array of positive integers(a[n]) . We are given multiple queries of the form : [x] which means we
    need to output the frequency of integer 'x' in the array. All numbers inside the array are from range [0,N-1].

    Approach :- We will store frequency of all integers from array 'a' into array 'b'. This is the main idea of Hashing ,
    we store the information of array 'a' into array 'b'(efficiently) which helps solving the problem efficiently.

    Time complexity :- 0(N)+O(Q) = O(N+Q) this is better then iterative approach since addition is much lower then multiplication

    Space Complexity :- O(N) we are using additional array to store the count

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1, 3, 3, 4, 1, 4, 4, 4, 4};
        int arraySize = array.length;
        int[] hashArray = new int[arraySize + 1];

        for (int i = 0; i < arraySize; i++) {
            int index = array[i];
            hashArray[index] = hashArray[index] + 1;
        }

        int querySize = scanner.nextInt();

        for (int i = 0; i < querySize; i++) {
            int query = scanner.nextInt();
            System.out.println(" Query " + query + " count " + hashArray[query]);

        }

    }
}
