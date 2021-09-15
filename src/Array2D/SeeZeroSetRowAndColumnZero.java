package Array2D;

import java.util.ArrayList;

public class SeeZeroSetRowAndColumnZero {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{0,1,1},{1,1,1},{1,1,1},{1,1,1}};
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;
        ArrayList<Integer> rowList = new ArrayList<>();
        ArrayList<Integer> columnList = new ArrayList<>();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (matrix[i][j] == 0) {
                    rowList.add(i);
                    columnList.add(j);
                }
            }
        }
        for (int i = 0; i < rowList.size(); i++) {
            int m = rowList.get(i);
            int n = columnList.get(i);
            for (int k = 0; k < rowSize; k++) {
                matrix[k][n] = 0;
            }
            for (int j = 0; j < columnSize; j++) {
                matrix[m][j] = 0;
            }
        }
        for(int i =0;i< rowSize;i++){
            for(int j =0;j< columnSize;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
