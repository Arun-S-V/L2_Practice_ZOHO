package Arrays2;

public class ContiguousSubArraySum {
    public static void main(String[] args) {
        int array[] =  new int[]{1,2,3,5,6,4};
        int target = 188;
        int indexI = 0;
        int indexJ = 0;
        boolean count = false;
        loop:for(int i =0;i< array.length-1;i++){
            int sum = array[i];
            for(int j = i+1;j< array.length;j++){
                sum = sum + array[j];;
                if(sum == target){
                    count = true;
                    indexI = i;
                    indexJ = j;
                    break loop;
                }
            }
        }
        if(count) {
            System.out.println("The sum of elements " + indexI + " position to " + indexJ + " position is " + target);
        }
        else{
            System.out.println("The array doesn't have a target with SubArray");
        }
    }
}
