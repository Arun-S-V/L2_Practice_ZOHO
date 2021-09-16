package Arrays2;

import java.util.HashMap;

public class KeyPairEqualTargetReturnTrue {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,6,9};
        int n = array.length;
        int target = 70;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int test = target-array[i];
            if(map.get(test) != null){
                count = count + map.get(test);
            }
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        if(count > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
