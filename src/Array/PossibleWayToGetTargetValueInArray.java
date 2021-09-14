package Array;

import java.util.Arrays;

public class PossibleWayToGetTargetValueInArray {
    public static void main(String[] args) {
        int array[] = {2, 5, 3, 6};
        int m = array.length;
        int n = 10;
        int table[] = new int[n+1];
        table[0] = 1;
        for (int i=0; i<m; i++) {
            for (int j = array[i]; j <= n; j++) {
                table[j] = table[j] + table[j - array[i]];
            }
        }
        System.out.println(table[n]);
        System.out.println(Arrays.toString(table));
    }
}