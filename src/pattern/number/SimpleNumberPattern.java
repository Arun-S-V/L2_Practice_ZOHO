package pattern.number;

public class SimpleNumberPattern {
    public static void main(String[] args){
        int range = 9;
        for(int i =0;i<range;i++){
            int number = 1;
            for(int j =0;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}



/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */