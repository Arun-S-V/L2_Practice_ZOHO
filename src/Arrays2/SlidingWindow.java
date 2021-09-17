package Arrays2;

import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int array[] = new int[]{1,3,-1,-3,5,3,6,7};
        int n = array.length;
        int k =3;
        for(int i =0;i<n-k+1;i++){
            int max = array[i];
            for(int j =i;j<k+i;j++){
                if(array[j]>max){
                    max = array[j];
                }
            }
            list.add(max);
        }
        System.out.println(list);
    }
}
