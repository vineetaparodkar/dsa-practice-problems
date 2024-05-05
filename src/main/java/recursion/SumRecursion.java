package recursion;

public class SumRecursion {
    /*

    Question :- Use recursion to calculate sum of N numbers

    Approach :- calling itself N + sumOfN(N -1)

    Time complexity :-

    Space Complexity :-

    */

    public static int sumOfN(int size) {
        if (size == 1) {
            return 1;
        } else {
            return size + sumOfN(size - 1);
        }
    }

    public static void main(String[] args) {
        int size = 5;
        int sum = sumOfN(size);
        System.out.println("Sum of first " + size + " natural numbers: " + sum);
    }
}
