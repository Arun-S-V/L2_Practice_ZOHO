package Array;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class PairClosestToTargetNumber {
    static void printClosest(int array[], int n, int x) {
        int result_l=0;
        int result_r=0;
        int l = 0;
        int r = n-1;
        int diff = 1000;
        while (r > l) {
            if (((array[l] + array[r] - x)<0 ? -(array[l] + array[r] - x):(array[l] + array[r] - x)) < diff) {
                result_l = l;
                result_r = r;
                diff = (array[l] + array[r] - x)<0?-(array[l] + array[r] - x):(array[l] + array[r] - x);
            }
            if (array[l] + array[r] > x)
                r--;
            else
                l++;
        }

        System.out.println(" The closest pair is "+array[result_l]+","+ array[result_r]);
    }


    public static void main(String[] args)
    {
        int array[] =  {10, 22, 28, 29, 30, 40}, x = 54;
        int n = array.length;
        printClosest(array, n, x);
    }

}

//PairClosestToTargetNumber