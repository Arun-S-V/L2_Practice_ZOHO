package Array2D;

import java.sql.SQLOutput;
import java.util.Arrays;

public class RotateAMatrixElementAndCompare {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2, 1, 2, 1},
                {2, 1, 2, 1}};

        //int[][] tempMatrix = matrix;
        //System.out.println(Arrays.deepToString(matrix));
        int range = 2;
        int m = matrix.length;
        int n = matrix[0].length;
        int tempMatrix [][] = new int[m][n];
        for(int i =0;i< m;i++){
            for(int j =0;j< n;j++){
                tempMatrix[i][j] = matrix[i][j];
            }
        }
        //System.out.println(Arrays.deepToString(tempMatrix));
        for(int o =0;o<range;o++) {
            for (int i = 0; i < m; i++) {
                int index1 = tempMatrix[i][0];
                int index2 = tempMatrix[i][m - 1];
                if (i % 2 == 0) {
                    for (int k = 0; k < m - 1; k++) {
                        tempMatrix[i][k] = tempMatrix[i][k + 1];
                    }
                    tempMatrix[i][m-1] = index1;
                }
                else {
                    for (int k=n-1; k>0; k--) {
                        tempMatrix[i][k] = tempMatrix[i][k-1];
                    }
                    tempMatrix[i][0] = index2;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(tempMatrix));
        boolean flag = true;
        loop:for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(tempMatrix[i][j] != matrix[i][j]){
                    flag = false;
                    break loop;
                }
            }
        }
        if(flag){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}