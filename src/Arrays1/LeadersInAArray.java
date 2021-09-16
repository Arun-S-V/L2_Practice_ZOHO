package Arrays1;

import java.util.ArrayList;

public class LeadersInAArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int array[] = new int []{16,17,4,3,5,2};
        int n = array.length;
        int maxRight = array[n-1];
        list.add(maxRight);
        for(int i =n-2;i>=0;i--){
            if(maxRight<array[i]){
                maxRight = array[i];
                list.add(maxRight);
            }
        }
        System.out.println(list);
    }
}



/*
static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int maxRight = arr[n-1];
        for(int i =n-2;i>=0;i--){
            if(maxRight<=arr[i]){
                maxRight = arr[i];
                list.add(maxRight);
            }
        }
        list.add(arr[n-1]);
        Collections.sort(list,Collections.reverseOrder());
        return list;
    }
 */