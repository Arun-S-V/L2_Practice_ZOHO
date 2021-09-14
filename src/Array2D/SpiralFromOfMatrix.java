package Array2D;

public class SpiralFromOfMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3, 16}, {4, 5, 6, 15}, {7, 8, 9, 14}, {10, 11, 12, 13}};
        int m = matrix.length;
        int n = matrix[0].length;
        int a = 0;
        int b = m - 1;
        int c = 0;
        int d = n - 1;
        while(a<=b && c<=d) {
            for (int i = a; i <= b; i++) {
                System.out.print(matrix[c][i]+"\t");
            }
            c++;
            for (int i = c; i <= d; i++) {
                System.out.print(matrix[i][b]+"\t");
            }
            b--;
            for (int i = b; i >= a; i--) {
                System.out.print(matrix[d][i]+"\t");
            }
            d--;
            for (int i = d;i>=c;i--){
                System.out.print(matrix[i][a]+"\t");
            }
            a++;
        }
    }
}
