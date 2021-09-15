package Array2D;

public class SumOfAllElementsInMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2},{3,4},{8,9},{10,7}};
        int N = matrix.length;
        int M = matrix[0].length;
        int result = new SumOfAllElementsInMatrix().sumOfMatrix(N,M,matrix);
        System.out.println(result);
    }
    int sumOfMatrix(int N, int M, int[][] grid) {
        int sum = 0;
        for(int i =0;i<N;i++){
            for(int j =0;j<M;j++){
                sum = sum + grid[i][j];
            }
        }
        return sum;
    }
}
