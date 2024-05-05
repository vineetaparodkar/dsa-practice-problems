package hashing;

import java.util.Scanner;

public class HashArrayApproach {

    /*

    Question :- You are given an array of size “n” ; you are also given “Q” queries for each of the
    query please tell how many times a given number occurs in the array. Use Hasharray approach.

    Approach :- Create an array to keep the count of times the input number comes in, so value will be
    count and index will be actual number. For every query retrieve the corresponding index value

    Time complexity :- 0(N)+O(Q) = O(N+Q) this is better then iterative approach since addition is much lower then multiplication

    Space Complexity :- O(N) we are using additional array to store the count

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] hashArray = new int[arraySize+1];

        for (int i = 0; i < arraySize; i++) {
            int index = scanner.nextInt();
            hashArray[index] = hashArray[index]+1;
        }

        int querySize = scanner.nextInt();

        for (int i = 0; i < querySize; i++) {
            int query = scanner.nextInt();
            System.out.println(" Query " + query + " count " + hashArray[query]);

        }
    }
}
