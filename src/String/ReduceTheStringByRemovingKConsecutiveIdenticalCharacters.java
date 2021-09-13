package String;

import java.util.ArrayList;
import java.util.Arrays;

public class ReduceTheStringByRemovingKConsecutiveIdenticalCharacters {
    public static void main(String args[]){
        String str = "geeksforgeeks";
        int k = 2;
        int cnt = 1, n = str.length();
        String res = "";
        char c = str.charAt(0);
        for (int i = 1; i <= n; i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                cnt++;
                if (cnt == k) {
                    i++;
                    c = str.charAt(i);
                    cnt = 1;
                }
            }
            else {
                res += (cnt * c);
                c = str.charAt(i);
                cnt = 1;
            }
        }
        System.out.println(res);
    }
}

