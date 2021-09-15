package Array2D;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaximumNumberOfOnesRowConvertedToZero {

    public static void main(String[] args) {
        int matrix[][] = { {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0} };
        int m = matrix.length;
        int n = matrix[0].length;
        changeOneRwoToZero(matrix,m,n);
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void changeOneRwoToZero(int matrix[][],int m,int n){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        int count = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            map.put(i,count);
            count=0;
        }
        //System.out.println(map);
        int index = 0;
        int l = map.get(0);
        for(int i =0;i< map.size();i++){
            int k = map.get(i);
            if(k>l){
                l = k;
                index = i;
            }
        }
        //System.out.println(index);
        for(int i=0;i<m;i++){
            matrix[index][i] = 0;
        }
    }
}
