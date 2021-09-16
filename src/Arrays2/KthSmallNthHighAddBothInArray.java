package Arrays2;

import java.util.Arrays;

public class KthSmallNthHighAddBothInArray {
    public static void main(String[] args) {
        int array[] = new int[]{6,87,34,12,54,2,7};
        int K = 3;
        int N = 2;
        int n = array.length;
        mergeSort(array,0,n-1);
        //Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min = array[K-1];
        int max = array[n-N];
        int result = min+max;
        System.out.println(result);
    }
    public static void mergeSort(int array[], int start,int end) {
        int mid=(start+end)/2;
        if(start<end) {
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(start,mid,end,array);
        }
    }
    private static void merge(int start, int mid, int end, int []array) {
        int[] tempArray=new int[array.length];
        int tempArrayIndex=start;
        int startIndex=start;
        int midIndex=mid+1;
        while(startIndex<=mid && midIndex<=end) {
            if(array[startIndex]< array[midIndex]) {
                tempArray[tempArrayIndex++]=array[startIndex++];
            }
            else {
                tempArray[tempArrayIndex++]=array[midIndex++];
            }
        }
        while(startIndex<=mid) {
            tempArray[tempArrayIndex++]=array[startIndex++];
        }
        while(midIndex<=end) {
            tempArray[tempArrayIndex++]=array[midIndex++];
        }
        for (int i = start; i <=end; i++) {
            array[i]=tempArray[i];
        }
    }
}
