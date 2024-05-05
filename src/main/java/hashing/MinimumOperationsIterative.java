package hashing;

public class MinimumOperationsIterative {
     /*

    Topic - Minimum operations to make all elements equal in an array.

    Question :- Given an array consisting of positive integers, return the minimum number of operations to make all the elements of the array equal.
    The operations can be addition, multiplication, division, or subtraction.

    Approach :- In order to make all the elements equal, we will be selecting a value from the array(the target element)
    and converting the rest of the elements into the selected element. The target element will be the element
    that has the highest frequency in the array. Let's say the element with the highest frequency occurs k times. Thus, we
    would require at least n-k operations for making all the array elements equal.

    Time complexity :- O(n*n) since we iterate n times for each element of array size n

    Space Complexity :- O(1) constant since there is no additional space used just used the

    */

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,4};
        int highestFrequency=0; //is the highest frequency found so far

        for(int i=0;i<array.length;i++){
            int currentFrequency=0; //currentFrequency is the frequency of the current element
            for(int j=0;j< array.length;j++){
                if(array[i]==array[j]) currentFrequency++;
            }
            if(highestFrequency<currentFrequency){
                highestFrequency=currentFrequency;
            }
        }
        System.out.println("Least operations required are : "+(array.length-highestFrequency));
    }
}
