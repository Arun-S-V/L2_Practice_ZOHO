package String;

import java.util.Arrays;

public class ConvertTheCases {
    public static void main(String args[]){
        String str = "Hey HoW Are You";
        char array[] = str.toCharArray();
        for(int i =0;i<array.length;i++){
            if(array[i] >= 65 && array[i] <= 90){
                array[i] = (char)((int)array[i]+32);
            }
            else if(array[i] >= 97 && array[i] <= 122){
                array[i] = (char)((int)array[i]-32);
            }
        }
        str = "";
        for(int i =0;i< array.length;i++){
            str = str + array[i];
        }
        System.out.println(str);
    }
}
