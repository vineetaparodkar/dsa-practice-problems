package twopointer;

/*
*
* Approach -
* 1. we need triplets so outer loop should run till second last element
* 2. Outer Loop: The outer loop starts from the first element and goes up to the third last element (i.e., i < nums.length - 2) since we need at least three elements for a triplet.
    Inner Loops:
    The first inner loop (j) finds the second element such that nums[j] - nums[i] == diff.
    If such a j is found, the second inner loop (k) finds the third element such that nums[k] - nums[j] == diff.
  3. Count: If both conditions are met, increment the count.
*
* */
public class ArithmeticTriplet {

    public static int arithmeticTriplets(int[] nums, int diff) {

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = i + 2;
            while (j < nums.length-1 && nums[j] - nums[i] < diff) {
                j++;
            }
            if (j < nums.length-1 && nums[j] - nums[i] == diff) {
                while (k < nums.length-1 && nums[k] - nums[j] < diff) {
                    k++;
                }
                if (nums[k] - nums[j] == diff) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
    }
}
