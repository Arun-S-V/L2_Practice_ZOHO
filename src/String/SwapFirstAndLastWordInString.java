package String;

import java.util.Arrays;

public class SwapFirstAndLastWordInString {
    public static void main(String args[]){
        String str = "Hello this is the GFG user";
        //String str = "Hello Word";
        String array [] = str.split(" ");
        String temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        str = "";
        for(int i =0;i< array.length;i++){
            str = str + array[i]+" ";
        }
        System.out.println(str);
    }
}
