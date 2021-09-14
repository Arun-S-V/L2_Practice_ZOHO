package Array;

import java.util.Arrays;

public class MinimumDifferenceBetweenPairs {
    public static int minimum_difference(int[] array)
    {
        int diff = 0;
        int com = array[0]-array[1];
        com = com<0?-com:com;
        int a = 0;
        int b = 0;
        for(int i =0;i<array.length-1;i++){
            for(int j =i+1;j<array.length;j++){
                diff = array[i]-array[j];
                diff = diff<0?-diff:diff;
                if(diff<com){
                    com = diff;
                    a = array[i];
                    b= array[j];
                }
            }
        }
        System.out.println(a+" and "+b);
        return com;
    }
    public static int minimum_difference(int[] nums,int n)
    {
        int a = 0;
        int b =0;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i+1] - nums[i] <diff){
                diff = nums[i+1] - nums[i];
                a = nums[i];
                b = nums[i+1];
            }
        }
        System.out.println(a+" and "+b);
        return diff;
    }
    public static void main(String args[]){
        int array[] = {2, 4, 6, 9, 7};
        int result = minimum_difference(array);
        System.out.println(result);
        int res = minimum_difference(array, array.length);
        System.out.println(res);
    }
}
