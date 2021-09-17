package pattern.number;

public class XOPattern {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        char matrix[][] = new char[m][n];
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        char in = 'X';
        while(top<=bottom && left<=right) {
            for(int i = left;i<=right;i++){
                matrix[top][i] = in;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                matrix[i][right] =  in;
            }
            right--;
            for(int i = right;i>=left;i--){
                matrix[bottom][i] = in;
            }
            bottom--;
            for(int i =bottom;i>=top;i--){
                matrix[i][left] = in;
            }
            left++;
            in = (in == 'X')? 'O' : 'X';
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}