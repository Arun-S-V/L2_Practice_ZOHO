package Array2D;

import java.util.Scanner;

public class MatrixMultiplicationAndTranspose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows matrix 1: ");
        int m1 = scan.nextInt();
        System.out.println("Enter the number of columns matrix 1: ");
        int n1 = scan.nextInt();
        int array1[][] = new int[m1][n1];
        for(int i =0;i<m1;i++){
            for(int j =0;j<n1;j++){
                array1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the number of rows matrix 2: ");
        int m2 = scan.nextInt();
        System.out.println("Enter the number of columns matrix 2: ");
        int n2 = scan.nextInt();
        int array2[][] = new int[m2][n2];
        for(int i =0;i<m2;i++){
            for(int j =0;j<n2;j++){
                array2[i][j] = scan.nextInt();
            }
        }
        int resultArray[][] = matrixMultiplicationAndTranspose(array1,array2);
        for(int i =0;i<m2;i++){
            for(int j =0;j<n2;j++){
                System.out.print(resultArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplicationAndTranspose(int[][] array1,int[][]array2){
        int size = array1.length;
        int resultArray[][] = new int[size][size];
        for(int i =0;i<size;i++){
            for(int j  =0;j<size;j++){
                for(int k =0;k<size;k++){
                    resultArray[i][j] = resultArray[i][j] + array1[i][k] * array2[k][j];
                }
            }
        }
        for(int i =0;i<size;i++){
            for(int j =i;j<size;j++){
                int temp = resultArray[i][j];
                resultArray[i][j] = resultArray[j][i];
                resultArray[j][i] = temp;
            }
        }
        return resultArray;
    }
}
