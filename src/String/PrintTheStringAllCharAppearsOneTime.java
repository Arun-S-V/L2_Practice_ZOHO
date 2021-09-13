package String;

import java.util.*;

public class PrintTheStringAllCharAppearsOneTime {
    public static void main(String args[]) {
        String str = "bcabc";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 1);
        }
        //System.out.println(map);
        str = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            str = str + entry.getKey();
        }
        System.out.println(str);
    }


}
