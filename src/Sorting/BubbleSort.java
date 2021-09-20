package Sorting;

public class BubbleSort {
    static void bubbleSort(int[] a,int n){
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(a[j] < a[i])    {    
					int temp = a[i];
					a[i] = a[j];    
					a[j] = temp;     
                }    
            }     
        }       
	}
}