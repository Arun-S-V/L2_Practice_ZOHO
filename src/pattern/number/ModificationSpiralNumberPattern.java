package pattern.number;

public class ModificationSpiralNumberPattern {
    public static void main(String[] args) {
        int inputNumber = 5;
        int value = 1;
        int matrix[][] = new int[inputNumber][inputNumber];
        int top = 0;
        int bottom = inputNumber-1;
        int left = 0;
        int right = inputNumber-1;
        while(top<=bottom && left<=right) {
            for(int i = left;i<=right;i++){
                matrix[top][i] = value;
                value++;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                matrix[i][right] =  value;
                value++;
            }
            right--;
            for(int i = right;i>=left;i--){
                matrix[bottom][i] = value;
                value++;

            }
            bottom--;
            for(int i =bottom;i>=top;i--){
                matrix[i][left] = value;
                value++;
            }
            left++;
            inputNumber--;
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j< matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


/*
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
 */