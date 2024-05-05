package hashing;

import java.util.Scanner;

public class IterativeApproach {

    /*

    Question :- You are given an array of size “n” ; you are also given “Q” queries for each of the
    query please tell how many times a given number occurs in the array. Use Hasharray approach.

    Approach :- Run for loop for Q array and check Q[i] is present anywhere in the original array by
    running the for loop to iterate every element in array and check if that element matches the Q[i]

    Time complexity :- O(NQ) since we are running the loop N times over input array for given Q queries
    O(N + N*Q) = O(N*(1+Q)) ====O(N*Q)

    Space Complexity :- No space complexity since we are not using additional space

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int querySize = scanner.nextInt();

        for (int i = 0; i < querySize; i++) {
            int count = 0;
            int query = scanner.nextInt();
            for (int j = 0; j < arraySize; j++) {
                if (query == array[j])
                    count++;
            }

            System.out.println(" Query " + query + " count " + count);
        }
    }
}
