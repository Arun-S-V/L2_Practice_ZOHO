package Array;

public class MinimumJumpToReachLast {
    public static void main(String[] args) {
        int array[] = {0,0,0,9};
        int result = minimumJump(array);
        System.out.println(result);
    }
    public static int minimumJump(int array[]){
        int length = 0;
        int maxLength = 0;
        int jump = 0;

        for(int i = 0; i < array.length - 1; i++) {
            length--;
            maxLength--;
            if(maxLength<array[i]){
                maxLength = array[i];
            }
            if(length <= 0) {
                length = maxLength;
                jump++;
            }
            if(length >= array.length - i - 1)
                return jump;
        }
        return jump;
    }
}


/*
if(maxLength<array[i]){
maxLength = array[i];
}
 */