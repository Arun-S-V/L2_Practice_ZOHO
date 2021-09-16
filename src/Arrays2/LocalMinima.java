package Arrays2;

import java.util.ArrayList;

public class LocalMinima {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int array[] = new int[]{7 ,1 ,1 ,4};
        if(array[0] <= array[1]){
            list.add(array[0]);
        }
        for(int i =1;i< array.length-1;i++){
            if(array[i]<=array[i-1]  && array[i]<=array[i+1]){
                list.add(array[i]);
            }
        }
        if(array[array.length-1] <= array[array.length-2]){
            list.add(array[array.length-1]);
        }
        System.out.println(list);
    }
}


/*
Local Minima Given an array of size n, find all local minima in the array Hint: A
local minimum of an array is an element which is less than or equal to both of its
neighbours
Sample Case 1:
Input:
Enter the array size: 7
Enter the elements: 9 6 2 14 5 7 4
Output:
Local Minima: 2 5 4
 */