package Array2D;

import java.util.ArrayList;
import java.util.Collections;

public class SortRightDiagonalElements {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 7, 6},
                          {5, 8, 9}
        };
        int n = matrix.length;
        sortRightDiagonal(matrix);
        for(int i =0;i< matrix.length;i++){
            for(int j =0;j< matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sortRightDiagonal(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0,j= matrix.length-1;i< matrix.length && j>=0;i++,j--){
            list.add(matrix[i][j]);
        }
        Collections.sort(list);
        for(int i=0,j= matrix.length-1;i< matrix.length && j>=0;i++,j--){
            matrix[i][j] = list.get(i);
        }
    }
}
