package String;

import java.util.ArrayList;

public class FindLastWordLengthInString {
    public static void main(String args[]){
        String str = "  fly me   to   the moonm  ";
        String array[] = str.split(" ");
        int len = array[array.length-1].length();
        System.out.println("The last word is : "+len);
    }
}