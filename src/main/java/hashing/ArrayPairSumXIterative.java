package hashing;

public class ArrayPairSumXIterative {
    /*

    Topic : - Find out the pair from array whose sum forms the number 'x' when both the numbers of the pair are added

    Question :- Given an array arr1 and number 'x', To find if a pair exists in arr1 which can be added to make number 'x'.

    Approach :- we have to find the pair so to find the pair in the array, we can take one element from the
    array and check the remaining part by adding every element with the taken element if we get the sum equal
    to the number 'x' we will return true otherwise false.
    So this can be done by using 2 'for' loops, First Loop we will use to take first element and Second loop will
    be used to traverse the array to find the second number.

    Time complexity :- O(N*N)

    Space Complexity :- (O)

    */
    public static void main(String[] args) {
        int[] array = new int[]{0, -1, 2, -3, 1};
        int x = -2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == x && i!=j) {
                    System.out.println("(" + array[i] + "," + array[j]+")");
                    System.out.println("(" + array[j] + "," + array[i]+")");
                    return;
                }
            }
        }
        System.out.println("No pairs found");
    }
}
