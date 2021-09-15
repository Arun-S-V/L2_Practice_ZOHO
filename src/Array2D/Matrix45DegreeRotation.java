package Array2D;

public class Matrix45DegreeRotation {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k =0;
        int space = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <space; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <=i; k++) {
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
            space--;
        }
        space  = 1;
        for(int i = matrix.length-1;i>0;i--){
            for(int j = 0;j<space;j++){
                System.out.print(" ");
            }
            for(int k =0;)
        }
    }
}
