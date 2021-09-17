package Arrays2;

import java.util.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        missingElement();
        int array[] = new int[]{1,2,3,4,5,7};
        int max = array[0];
        for(int i=0;i< array.length;i++){
            if(array[i] >max){
                max = array[i];
            }
        }
        int hashArray[] = new int[max+1];
        Arrays.fill(hashArray,0);
        for(int j =0;j< array.length;j++){
            int x = array[j];
            hashArray[x]++;
        }
        for(int i =1 ;i< hashArray.length;i++){
            if(hashArray[i] == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void missingElement(){
        int array[] = {1,2,4,5,6,7};
        int n = array.length+1;
        int totalSum =  (n*(n+1))/2;
        System.out.println(totalSum);
        int sum = 0;
        for(int i =0;i<array.length;i++){
            sum =sum +array[i];
        }
        System.out.println(sum);
        System.out.println(totalSum-sum);
    }
}
