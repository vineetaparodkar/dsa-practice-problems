package hashing;

import java.util.Arrays;

public class ArrayDuplicateSubsetIterative {
    /*

    Topic - Check if the given array is subset of another array

    Question :- Given two arrays, arr1 and arr2, check if arr2 is a subset of arr1.
    You can assume there are duplicates in both the arrays.

    Approach :- Note there are duplicates this time. sort the array. iterate both the arrays simultaneously.
    if arr1[i]==arr2[j] then increment the i,j pointers
    if arr1[i]<arr[2] then increment i
    if arr1[i]>arr[j] then this means element is not there in arr2 because array is sorted and if element is higher in 1st array
    that means its not possible to find smaller element of arr2 any further so its not possible to suset of array1

    Time complexity :- O(n⋅log(n)+m⋅log(m))+O(n+m)

    time complexity explaination:-
    Sorting both arrays:
    Sorting arr1 using a comparison-based sorting algorithm like quicksort or mergesort has a time complexity of O(n * log(n)), where n is the size of arr1.
    Sorting arr2 using the same algorithm has a time complexity of O(m * log(m)), where m is the size of arr2.
    Checking if arr2 is a subset of arr1:
    We iterate through both arrays once after sorting them.
    The size of arr1 is n and the size of arr2 is m.
    So, iterating through both arrays has a time complexity of O(n + m).

    Space Complexity :-we're not using any extra space other than the arrays themselves, the space complexity is O(1) (constant space)

    */
    public static void main(String[] args) {

        int[] arrayOne = new int[]{2,4,5};
        int[] arrayTwo = new int[]{5,4,2,5};

        //step1: sort the array
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        //step2 Iterate over both arrays simultaneously
        int i=0;
        int j=0;
        while(i<arrayOne.length && j<arrayTwo.length){

            if(arrayOne[i]==arrayTwo[j]){
                i++;
                j++;
            }
            else if(arrayOne[i]<arrayTwo[j]){
                i++;
            }
            else{
                // If arr1[i] > arr2[j], it means arr2[j] is not present in arr1
                System.out.println("Array 2 is not subset of array1");
                return;
            }
        }

        // If all elements of arr2 are found in arr1, then arr2 is a subset
        // need to check this condition becoz of following possibilities
        // possibility 1 - arr1 length might be shorter then array2 that means array2 is not subset of array1 since all elements are not there in array1
        // possibility 2 - arr2 lengeth might be shorter then array1 then in that case we will have to check if all the elements of array2 are there in array1 which is possible by checking
        //if j counter of array2 is equal to arr2.length since we are incrementing j if match is found so in that case j will be equal to
        // all other elements in array1
        if(j==arrayTwo.length){
            System.out.println("Array2 is subset of array1");
        }else{
            System.out.println("Array2 is not subset of array1");
        }

    }
}
