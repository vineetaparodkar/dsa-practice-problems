package hashing;

public class ArraySubsetIterative {
     /*

    Topic - Check if the given array is subset of another array

    Question :- Given two arrays, arr1 and arr2, check if arr2 is a subset of arr1.
    You can assume there are no duplicates in both the arrays.

    Approach :- Note there are no duplicates. For every element of arr2, check whether it is present in arr1 by iterating over it.

    Time complexity :- O(n*m), where n and m are sizes of arr1 and arr2 respectively.

    Space Complexity :-O(1)

    */
     public static void main(String[] args) {

          int[] arrayOne = new int[]{1, 3, 4, 8, 11, 12};
          int[] arrayTwo = new int[]{1, 3, 4};

          boolean response=false;
          for(int i=0;i<arrayTwo.length;i++){
               for(int j=0;j<arrayOne.length;j++){
                    if(arrayTwo[i]==arrayOne[j]){
                         response=true;
                         break;
                    }else{
                         response=false;
                    }
               }
               if(!response){
                    System.out.println("Array2 is not a subset of array1");
               }
          }
          if(response){
               System.out.println("Array2 is subset of array1");
          }

     }
}
