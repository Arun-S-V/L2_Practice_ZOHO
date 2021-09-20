package Sorting;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class KthSmallest{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        int result = arr[k-1];
        return result;
    } 
}

class KthSmallestElement2{
	public static int kthSmallestElement(int array[],int n,int k){
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(int i =0;i<n;i++){
			if(map.containsKey(array[i])){
				map.put(array[i],map.get(array[i])+1);
			}
			else{
				map.put(array[i],1);
			}
		}
		int count = 0;
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			count = count + entry.getValue();
			if(count == k){
				return entry.getKey();
			}
		}
		return 1;
	}
}