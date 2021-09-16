package Arrays2;

public class RemoveDuplicateFromSortedArray {
    static int removeDuplicate(int array[],int n){
        int temp [] = new int[n];
        int x = 0;
        for(int i=0;i<n-1;i++){
            if(array[i] != array[i+1]){
                temp[x] = array[i];
                x++;
            }
        }
        temp[x++] = array[n-1];

        for(int i =0;i<x;i++){
            array[i] = temp[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int array[] = new int[]{1,1,2,2,3,4,5,6,6,7,7,8};
        int n = array.length;
        int x  =removeDuplicate(array,n);
        for(int i =0;i<x;i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
