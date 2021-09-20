package Sorting;

import java.util.Arrays;

class ArraysEqualCheck{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        int len1 = A.length;
        int len2 = B.length;
        if(len1 != len2){
            return false;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0 ;i<len2;i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
    }
}