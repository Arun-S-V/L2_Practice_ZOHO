package String;

import java.util.Hashtable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class patternMatchWithString {
    public static void main(String args[]) {
        String pattern = "abbac";
        String str = "dog cat cat dog bat";
        String[] s = str.split(" ");
        System.out.println(stringMatch(pattern,s));
    }
    public static boolean stringMatch(String pattern,String array[]){
        if(pattern.length() != array.length){
            return false;
        }
        int count = 0;
        HashMap<Character,String> map = new LinkedHashMap<>();
        for(int i =0;i< array.length;i++){
            if(map.containsKey(pattern.charAt(i))){

            }
            else{
                map.put(pattern.charAt(i),array[i]);
            }
        }
        for(int i =0;i<pattern.length()/2;i++) {
            if (pattern.charAt(i) != pattern.charAt(i+1)){
                if(map.get(pattern.charAt(i)).equals(map.get(pattern.charAt(i+1)))){
                    return false;
                }
            }
        }
        //System.out.println(map);
        for(int i =0;i<pattern.length();i++){
            if(map.get(pattern.charAt(i)).equals(array[i])){
                count++;
            }
        }
        //System.out.println(count);
        if(count == array.length){
            return true;
        }
        else {
            return false;
        }
    }
}
