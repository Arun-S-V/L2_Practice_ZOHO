package Arrays1;

public class RotateArrayByItsLength {
    public static void main(String args[]) {
        int array[] = new int[]{1, 4, 6, 7, 3, 9};
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int x = array[n-1];
            for(int i =n-1;i>0;i--){
                array[i] = array[i-1];
            }
            array[0] = x;
        }
        for(int i =0;i<n;i++){
            System.out.print(array[i]+"  ");
        }
    }
}



//Also refer for a K th time of rotation....................................................