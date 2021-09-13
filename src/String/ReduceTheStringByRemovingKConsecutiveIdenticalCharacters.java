package String;

import java.util.ArrayList;
import java.util.Arrays;

public class ReduceTheStringByRemovingKConsecutiveIdenticalCharacters {
    public static void main(String args[]){
        String str = "geeksforgeeks";
        int k = 2;
        char array[] = str.toCharArray();
        String[] strSplit = str.split("");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strSplit));
        for(int i = 0;i<array.length;i++){
            if(strList.get(i) == strList.get(i+1)){
                strList.remove(i);
                strList.remove(i+1);
            }
        }
    }
}
