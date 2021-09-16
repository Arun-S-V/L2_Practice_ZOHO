package Arrays1;

import java.util.LinkedHashMap;

public class FindOnlyOneOccuranceOfArray{
    public static void main(String[] args) {
        int array[] = {2,2,5,6,5,6,3,4,3,7};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i =0;i< array.length;i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else{
                map.put(array[i], 1);
            }
        }
        //System.out.println(map);
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                System.out.println(array[i]);
               // break;
            }
        }
    }
}
