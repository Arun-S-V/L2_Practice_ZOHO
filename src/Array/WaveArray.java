package Array;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int array[] = {10, 5, 6, 3, 2, 20, 100};
        Arrays.sort(array);
        for(int i =0;i< array.length/2;i+=2){
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
