package Arrays2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MakeADistinctDigitArray {
    public static void main(String[] args) {
        String array[] = {"111", "222", "333", "4444", "666"};
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>(10);
        list.add(array[0].charAt(0));
        //System.out.println(list);
        for(int i = 0;i< array.length;i++){
            String str = array[i];
            for(int j = 0;j<str.length();j++){
                char ch = str.charAt(j);
                list.add(str.charAt(j));
                set.add(str.charAt(j));
            }
        }
        Collections.sort(list);
        System.out.println(set);
        int n = list.size();
        char temp [] = new char[n];
        int x = 0;
        for(int i=0;i<n-1;i++){
            if(list.get(i) != list.get(i+1)){
                temp[x] = list.get(i);
                x++;
            }
        }
        temp[x++] = list.get(n-1);

        for(int i =0;i<x;i++){
            list.set(i,temp[i]);
        }
        for(int i =0;i<x;i++){
            System.out.print(list.get(i)+"\t");
        }
    }
}
