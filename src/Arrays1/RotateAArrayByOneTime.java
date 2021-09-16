package Arrays1;

public class RotateAArrayByOneTime {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,7,8};
        int n = array.length;
        rightRotateByOne(array,n);
        for(int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        leftRotateByOne(array,n);
        for(int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void leftRotateByOne(int array[], int n) {
        int index = array[0];
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n-1] = index;
    }
    static void rightRotateByOne(int array[], int n){
        int index = array[n-1];
        for(int i =n-1;i>0;i--){
            array[i] = array[i-1];
        }
        array[0] = index;
    }
}