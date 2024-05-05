package hashing;

public class DuplicateWithinKDistanceIterative {
    /*

    Question :- Check if the following given array contains duplicate elements within k distance from each other.
    Given an unsorted array that may contain duplicates. Also given a number k which i.
    Even if we find one duplicate number having a distance less than equal to k(<=k), we would return true.

    Approach :- A Naive solution is to run two loops. The outer loop picks every element ‘arr[i]’ as a starting element,
    and the inner loop compares all elements which are within k distance of ‘arr[i]’.

    Time complexity :- O(k*n)

    Space Complexity :- o(1)

    */
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 7, 5, 4, 4};
        int kDistance =3;
        for(int i=0;i< array.length;i++){
            //checking 2 conditions j< array.length --> if its last element j++ should no go out of index
            //i-j<=kDistance difference between distance is calculated so its atmost kdistance
            for(int j=i+1;j< array.length && i-j<=kDistance;j++){
                if(array[i]==array[j]){
                    System.out.println("contains duplicate elements within k distance "+kDistance);
                    return;
                }
            }
        }
        System.out.println("Does not contain duplicate elements within k distance "+kDistance);

    }
}
