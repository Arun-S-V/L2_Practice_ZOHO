package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateInAString {
    public static void main(String args[]){
        String str = "geeksforgeeks";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            map.put(str.charAt(i),1);
        }
        str = "";
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            str = str +entry.getKey();
        }
        System.out.println(str);
    }
}
