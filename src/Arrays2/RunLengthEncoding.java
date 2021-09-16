package Arrays2;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String str ="aaaabbbcc";
        for(int i = 0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }
        str = "";
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            str = str + entry.getKey() +entry.getValue();
        }
        System.out.println(str);
    }
}