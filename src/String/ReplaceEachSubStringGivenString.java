package String;

import java.util.Arrays;

public class ReplaceEachSubStringGivenString {
    public static void main(String args[]){
        String str = "The quick brown fox jumps over the fox lazy dog";
        String target = "fox";
        String replace = "cat";
        String array[] = str.split(" ");
        for(int i =0;i<array.length;i++){
            if(array[i].equals(target)){
                array[i] = replace;
            }
        }
        for(int i =0;i< array.length;i++) {
            char array1[] = array[i].toCharArray();
            System.out.println(Arrays.toString(array1));
            int len1 = array.length;
            int len2 = target.length();
            for (int j = 0; j <= len1 - len2; j++) {
                int k;
                for (k = 0; k < len2; k++) {
                    if (array1[j + k] != target.charAt(k)) {
                        break;
                    }
                }
//                if (k == len2)
//                    return i;
//            }
//            return -1;
            }
        }
        str = "";
        for(int i =0;i< array.length;i++){
            str = str + array[i]+" ";
        }
        System.out.println(str);
    }
}
