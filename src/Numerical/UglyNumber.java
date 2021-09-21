package Numerical;

import java.util.ArrayList;

public class UglyNumber {
    public static void main(String[] args) {
        int n = 11;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.size());
        for (int i = 1; list.size() < n; i++) {
            if(i%2 == 0){
                list.add(i);
            }
            else if(i%3 == 0){
                list.add(i);
            }
            else if(i%5 == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
