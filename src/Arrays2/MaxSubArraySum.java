package Arrays2;

public class MaxSubArraySum {
    public static int maxSubArraySum(int array[]){
        int n = array.length;;
        int maxSo = Integer.MIN_VALUE;
        int maxEnd = 0;
        for(int i =0;i<n;i++){
            maxEnd = maxEnd+array[i];
            if(maxSo<maxEnd){
                maxSo = maxEnd;
            }
            if(maxEnd<0){
                maxEnd = 0;
            }
        }
        return maxEnd;
    }

    public static void main(String[] args) {
        int array[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int maxEnd = maxSubArraySum(array);
        System.out.println(maxEnd);
    }

}





/*
// contiguous array sum
class GFG {

    static void maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
        max_ending_here = 0,start = 0,
        end = 0, s = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                           + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        maxSubArraySum(a, n);
    }
}
 */