import java.util.Arrays;
public class SelectionSort
{
	public static void main(String[] args) {
		int array[] = new int[]{3,8,2,7,1,9,4};
		int n = array.length;
		for(int i = 0;i<n-1;i++){
		    int index = i;
		    for(int j = i+1;j<n;j++){
		        if(array[j] <  array[index]){
		            index = j;
		        }
		    }
		    int temp = array[index];
		    array[index] = array[i];
		    array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
