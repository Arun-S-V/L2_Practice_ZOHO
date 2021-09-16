package Arrays2;

import java.util.Arrays;

public class PrintUnionOfTwoArrays {
    public static void main(String[] args) {
        int array[] = new int[]{85 ,25 ,1 ,32 ,54 ,6};
        int array1[] = new int[]{85,2};
        int n = array.length;
        int m = array1.length;
        int result[] = new int[n+m];
        int k = 0;
        for(int i =0;i<n;i++){
            result[k] = array[i];
            k++;
        }
        for(int j =0;j<m;j++){
            result[k] = array1[j];
            k++;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        int temp [] = new int[n];
        int x = 0;
        for(int i=0;i<n-1;i++){
            if(result[i] != result[i+1]){
                temp[x] = result[i];
                x++;
            }
        }
        temp[x++] = result[n-1];

        for(int i =0;i<x;i++){
            result[i] = temp[i];
        }
        System.out.println(x+1);
    }
}
