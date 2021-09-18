import java.util.*;
class FrequencyBasedSort
{
    public static void main(String args[]){
        int arr[] = new int[]{5,6,6,5,1,2,6};
        int n = arr.length;
        sortByFreq(arr,n);
    }
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int arr2[] = new int[max+1];
        Arrays.fill(arr2,0);
        for(int i =0;i<n;i++){
            int x = arr[i];
            arr2[x]++;
        }
        System.out.println(Arrays.toString(arr2));
        int max1 = arr2[0];
        for(int i =0;i<n;i++){
            if(max1<arr2[i]){
                max1 = arr2[i];
            }
        }
        for(int i =0;i<arr2.length;i++){
           // int count = 0;
            if(arr2[i] <= max1 && arr2[i] != 0){
                int count = arr2[i];
                for(int j =0;j<count;j++){
                    //System.out.print(i);
                    list.add(i);
                }
            }
        }
        Collections.reverse(list);
        System.out.println(list);
        return list;
    }
    
}