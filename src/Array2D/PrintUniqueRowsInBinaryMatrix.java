package Array2D;

import java.util.ArrayList;

public class PrintUniqueRowsInBinaryMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 1, 0,1},
                          {1, 1, 1,0},
                          {1, 1, 0,1}
                         };
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList list = uniqueBinaryRows(matrix, m, n);
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }
    }
    public static ArrayList uniqueBinaryRows(int [][] matrix,int row,int column){
        ArrayList list = new ArrayList<>();
        for(int i =0;i<row;i++){
            boolean flag = false;
            loop:for(int j =0;j<i;j++) {
                flag = true;
                for (int k = 0; k < column; k++) {
                    if (matrix[i][k] != matrix[j][k]) {
                        flag = false;
                    }
                }
                if (flag) {
                    break loop;
                }
            }
            if(!flag){
                for(int l =0;l<column;l++){
                    //System.out.print(matrix[i][l]+"\t");
                    list.add(matrix[i][l]);
                }
                list.add("$");
            }
        }
        return list;
    }
}





/*
class GFG{

static int ROW = 4;
static int COL = 5;

// Function that prints all
// unique rows in a given matrix.
static void findUniqueRows(int M[][])
{

    // Traverse through the matrix
    for(int i = 0; i < ROW; i++)
    {
        int flag = 0;

        // Check if there is similar column
        // is already printed, i.e if i and
        // jth column match.
        for(int j = 0; j < i; j++)
        {
            flag = 1;

            for(int k = 0; k < COL; k++)
                if (M[i][k] != M[j][k])
                    flag = 0;

            if (flag == 1)
                break;
        }

        // If no row is similar
        if (flag == 0)
        {

            // Print the row
            for(int j = 0; j < COL; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }
}

// Driver Code
public static void main(String[] args)
{
    int M[][] = { { 0, 1, 0, 0, 1 },
                  { 1, 0, 1, 1, 0 },
                  { 0, 1, 0, 0, 1 },
                  { 1, 0, 1, 0, 0 } };

    findUniqueRows(M);
}
}
 */