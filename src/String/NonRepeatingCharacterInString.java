package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeatingCharacterInString {
    public static void main(String args[]) {
        String str = "aaruunnui@";
        char lastNonRepeat = '0';
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(int i = str.length()-1;i>=0;i--){
            if(map.get(str.charAt(i)) == 1){
                lastNonRepeat = str.charAt(i);
                break;
            }
        }
        if(lastNonRepeat != '0')
            System.out.println("The Last Non Repeating Element is : "+lastNonRepeat);
        else
            System.out.println("The String doesn't have a non repeating element");

    }
}