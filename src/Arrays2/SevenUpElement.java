package Arrays2;

import java.util.ArrayList;

public class SevenUpElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int array[] = new int[]{16,21,0,70,84,78};
        list.add(array[0]);
        for(int i =0;i< array.length;i++){
            if(array[i] != 0 && array[i] % 7 == 0){
                list.add(array[i]);
            }
        }
        System.out.println(list);
    }
}
