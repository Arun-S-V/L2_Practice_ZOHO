package pattern.number;

public class SpiralPatternOfNumbers {
    public static void main(String[] args) {
        int inputNumber = 5;
        int number = (inputNumber*2)-1;
        int matrix[][] = new int[number][number];
        int top = 0;
        int bottom = number-1;
        int left = 0;
        int right = number-1;
        while(top<=bottom && left<=right) {
            for(int i = left;i<=right;i++){
                matrix[top][i] = inputNumber;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                matrix[i][right] =  inputNumber;
            }
            right--;
            for(int i = right;i>=left;i--){
                matrix[bottom][i] = inputNumber;
            }
            bottom--;
            for(int i =bottom;i>=top;i--){
                matrix[i][left] = inputNumber;
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
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*/