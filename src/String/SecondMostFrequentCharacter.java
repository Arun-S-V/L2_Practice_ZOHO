package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostFrequentCharacter {
    public static void main(String args[]){
        String str = "successes";
        LinkedHashMap<Character,Integer> map  = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
       // System.out.println(map);
        int temp = 0;;
        char ch = '0';
        for(Map.Entry<Character,Integer> test: map.entrySet()){
            if(test.getValue() >= temp) {
                temp = test.getValue();
            }
        }
        for(Map.Entry<Character,Integer> test: map.entrySet()){
            if (temp == test.getValue()) {
                ch  = test.getKey();
                map.put(ch,0);
            }
        }
        temp = 0;
        for(Map.Entry<Character,Integer> test: map.entrySet()){
            if(test.getValue() >= temp) {
                temp = test.getValue();
            }
        }
        for(Map.Entry<Character,Integer> test: map.entrySet()){
            if (temp == test.getValue()) {
                ch  = test.getKey();
                break;
            }
        }
       // System.out.println(temp);
        System.out.println("Second Most Frequent Element is : "+ch);

    }
}