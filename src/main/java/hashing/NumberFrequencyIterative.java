package hashing;

import java.util.Scanner;

public class NumberFrequencyIterative {

    /*

    Topic - Find frequency of each number in the array

    Question :- Example :-
    Say I give you an array : [1,3,3,4,1,4,4,4,4] . And ask you(query) to find the frequency of some
    number in this array. I have multiple queries of this form.
    Meaning of frequency in this problem : Number of times a number appears in the array.
    Your final answer will look like this :-
    Query input number : (1) - Frequency of [1] = 2

    Approach :- Run for loop for Q array and check Q[i] is present anywhere in the original array by
    running the for loop to iterate every element in array and check if that element matches the Q[i]

    Time complexity :- O(NQ) since we are running the loop N times over input array for given Q queries
    O(N + N*Q) = O(N*(1+Q)) ====O(N*Q)

    Space Complexity :- No space complexity since we are not using additional space

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1,3,3,4,1,4,4,4,4};
        int arraySize = array.length;

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
