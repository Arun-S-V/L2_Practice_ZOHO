package pattern.number;

public class PROGRAMPattern {
    public static void main(String[] args) {
        String str = "PROGRAM";
        char array[] = str.toCharArray();
        for(int i =0,j= array.length-1;i< array.length/2 && j>=0;i++,j--){
            System.out.println(array[i]+" "+array[j]);
        }
        System.out.println(array[array.length/2]);
        for(int i = (array.length/2)-1,j=(array.length/2)+1;i>=0 && j< array.length;i--,j++){
            System.out.println(array[i]+" "+array[j]);
        }
    }
}



/*
P M
R A
O R
G
O R
R A
P M
*/


