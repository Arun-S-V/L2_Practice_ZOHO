package Arrays2;

public class SearchTargetPosition {
    public static void main(String[] args) {
        int array[] = new int[]{2,5};
        int target = 1;
        int result = searchPosition(array,target);
        System.out.println(result);
    }
    static int searchPosition(int array[],int target){
        if(target == 0){
            return 0;
        }
        if(array.length == 1 && target<array[0]){
            return 0;
        }
        if(array.length == 1 && target>array[0]){
            return 1;
        }
        for(int i  = 0;i<array.length;i++){
            if(array[i] == target){
                return i;
            }
        }
        for(int i =0;i< array.length-1;i++){
            if(target<array[0]){
                return 0;
            }
            if(target>array[array.length-1]){
                return array.length;
            }
            if(array[i]<target && array[i+1]>target){
                return i+1;
            }
        }
        return 1000;
    }
}
