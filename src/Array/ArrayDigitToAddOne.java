package Array;

import java.util.Arrays;

public class ArrayDigitToAddOne {
    public static void main(String[] args) {
        int array [] = {9,9,9};
        String str = "";
        for(int i = 0;i< array.length;i++){
            str = str + array[i];
        }
        int number = Integer.parseInt(str);
        int resultNum = number + 1;
        String resultStr = String.valueOf(resultNum);
        int array1[] = new int[resultStr.length()];
        for(int i = 0;i< array1.length;i++){
            array1[i] = resultStr.charAt(i)-48;
        }
        System.out.println(Arrays.toString(array1));
    }
}
