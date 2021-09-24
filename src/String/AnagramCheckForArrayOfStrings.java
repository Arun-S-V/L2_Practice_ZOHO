package String;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramCheckForArrayOfStrings {
    public static void main(String args[]){
        String array [] = {"no","on","is","si"};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<array.length;i++) {
            String s = array[i];
            char array1[] = s.toCharArray();
            Arrays.sort(array1);
            String str = "";
            for(int j = 0;j< array1.length;j++){
                str =str + array1[j];
            }
            list.add(str);
        }
        int count = 0;
        System.out.println(list);
        outer:for(int l =0;l<list.size()/2;l++) {
            for (int i = l+1; i < list.size(); i++) {
                if (list.get(l).equals(list.get(i))) {
                    System.out.print(array[i] + " "+array[i-1]);
                }
                if(count == list.size()){
                    break outer;
                }
            }
            System.out.println();
        }
    }
}
