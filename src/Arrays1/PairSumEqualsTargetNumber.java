package Arrays1;

import java.util.HashMap;
import java.util.Map;

public class PairSumEqualsTargetNumber {
    public static void main(String args[]){
        int array[] = {0, 14, 0, 4, 7, 8, 3, 5, 7};
        int target = 11;
        pairSumWithDuplicate(array,target);
    }
    public static void pairSumWithDuplicate(int []array, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i  = 0;i<array.length;i++){
            int complement = target-array[i];
            if(map.get(complement) != null){
                System.out.println("{"+array[i]+","+complement+"}");
                count = count + map.get(complement);
            }
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
    }
}
