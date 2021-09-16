package Arrays2;

import java.util.Arrays;

public class FindTheSingleElementInAnArray {
    public static void main(String[] args) {
        int array[] = {1,1,2,4,2,3,5,3,5};
        Arrays.sort(array);
        int i = 0;
        System.out.println(Arrays.toString(array));
        for(i =0;i<array.length-1;i+=2){
            if(array[i] != array[i+1]){
                System.out.println(array[i]);
                break;
            }
        }
        if(i == array.length-1) {
            System.out.println(array[array.length - 1]);
        }
    }
}
