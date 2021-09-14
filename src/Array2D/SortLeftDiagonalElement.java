package Array2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortLeftDiagonalElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of rows : ");
        int m = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = scan.nextInt();
        int array[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                array[i][j] = scan.nextInt();
            }
        }
        for(int i =0;i<m;i++){
            list.add(array[i][i]);
        }
        Collections.sort(list);
        for(int i=0;i<m;i++){
            array[i][i] = list.get(i);
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
