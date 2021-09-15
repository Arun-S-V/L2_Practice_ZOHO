package Array2D;

public class MatrixAntiClockwiseRotationWithoutUsingExtraSpace {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}
                         };
        rotateAntiClockWise(matrix);
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void rotateAntiClockWise(int matrix[][]) {
        int N = matrix.length;
        for(int i =0;i<N;i++){
            for(int j =i+1;j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0;i<N;i++){
            for(int j =0;j<N/2;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[N-1-j][i];
                matrix[N-1-j][i] = temp;
            }
        }
    }
}
