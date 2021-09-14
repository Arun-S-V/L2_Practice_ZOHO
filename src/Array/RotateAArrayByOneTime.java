package Array;

public class RotateAArrayByOneTime {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,7,8};
        int n = array.length;
        int index = array[n-1];
        for(int i =n-1;i>0;i--){
            array[i] = array[i-1];
        }
        array[0] = index;
        for(int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}