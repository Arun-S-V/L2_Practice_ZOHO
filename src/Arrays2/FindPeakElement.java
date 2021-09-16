package Arrays2;

public class FindPeakElement {
    public static void main(String[] args) {
        int array[] = new int[]{1,3,4,2,5,2};
        for(int i =1;i< array.length-1;i++){
            if(array[i]>array[i-1]  && array[i]>array[i+1]){
                System.out.println(array[i]);
                break;
            }
        }
    }
}
