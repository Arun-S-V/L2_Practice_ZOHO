package Sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class SortByDifference
{
    //Function to sort the array according to difference with given number.
    static void sortABS(int arr[], int n,int k)
    {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for(int i =0;i<n;i++){
            int diff = arr[i]-k;
            diff = diff<0 ? -diff:diff;
            if(map.containsKey(diff)){
                ArrayList<Integer> list = map.get(diff);
                list.add(arr[i]);
                map.put(diff, list);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(diff,list);
            }
        }
        System.out.println(map);
        int index = 0;
        for (Map.Entry entry : map.entrySet()){
            ArrayList<Integer> list = map.get(entry.getKey());
            for (int i = 0; i < list.size(); i++)
                    arr[index++] = list.get(i);
        }
    }
}
