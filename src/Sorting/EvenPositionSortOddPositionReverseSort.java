package Sorting;

import java.util.*;
class EvenPositionSortOddPositionReverseSort
{
    void bitonicGenerator(long arr[], int n)
    {
        ArrayList<Long> evenList = new ArrayList<>();
        ArrayList<Long> oddList = new ArrayList<>();
        for(int i =0;i<n;i=i+2){
            evenList.add(arr[i]);
        }
        for(int i =1;i<n;i=i+2){
            oddList.add(arr[i]);
        }
        Collections.sort(evenList);
        Collections.sort(oddList,Collections.reverseOrder());
        int i;
        for(i =0;i<evenList.size();i++){
            arr[i] = evenList.get(i);
        }
        for(int j= 0;j<oddList.size();j++,i++){
            arr[i] = oddList.get(j);
        }
    }
}
