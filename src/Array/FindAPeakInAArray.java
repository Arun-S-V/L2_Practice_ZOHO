package Array;

public class FindAPeakInAArray {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,1,3,5,6,4};
        int peak = findAPeak(array);
        System.out.println(peak);

    }
    public static int findAPeak(int array[]){
        int peak = 0;
        for(int i =1;i< array.length-1;i++){
            if(array[i-1] < array[i] && array[i+1]<array[i]){
                peak = array[i];
                //break;
            }
        }
        return peak;
    }
}