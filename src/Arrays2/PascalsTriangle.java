package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int rowIndex = 3;
        ArrayList<Integer> result = pascals(rowIndex);
        System.out.println(result);
        List<Integer> rs = getRow(rowIndex);
        System.out.println(rs);
    }
    public static ArrayList<Integer> pascals(int rowIndex){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        list.add(temp);
        ArrayList<Integer> temp1 = new ArrayList<>();
        temp1.add(1);
        temp1.add(1);
        list.add(temp1);
        for(int i = 2;i<rowIndex;i++){
            ArrayList<Integer> temp2 = new ArrayList<>();
            temp2.add(1);
            ArrayList<Integer> temp4 = list.get(i-1);
            for(int k = 0;k<temp4.size()-1;k++){
                int s = temp4.get(k)+temp4.get(k+1);
                temp2.add(s);
            }
            temp2.add(1);
            list.add(temp2);
        }
        return (list.get(rowIndex-1));
    }

    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;
        Integer[] array = new Integer[rowIndex];
        for (int row = 0; row < rowIndex; row++) {
            if (row == 0) {
                array[0] = 1;
                continue;
            }
            for (int col = row; col >= row / 2; col--) {
                if (col == row || col == 0) {
                    array[col] = 1;
                } else {
                    array[col] = array[row - col] + array[row - col - 1];
                }
            }
            // Mirror half array
            for (int col = 0; col <= row / 2; col++) {
                array[col] = array[row - col];
            }
        }
        return Arrays.asList(array);
    }
}



