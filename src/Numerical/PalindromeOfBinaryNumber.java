package Numerical;

import java.util.ArrayList;

public class PalindromeOfBinaryNumber {
    static long isPalindrome(long N){
        ArrayList<Long> list = new ArrayList<>();
        while(N>0){
            list.add(N%2);
            N = N/2;
        }
        String s1 = "";
        String s2 = "";
        for(int i =0;i<list.size();i++){
            s1 = s1 + list.get(i);
        }
        for(int j = list.size()-1;j>=0;j--){
            s2= s2 + list.get(j);
        }
        if(s1.equals(s2)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
