package pattern.number;

public class PascalTriangleNumbers {
    public static void main(String[] args) {
        int range = 5;
        int space = range-1;
        for(int i =1;i<=range;i++){
            for(int j =1;j<=range-i;j++){
                System.out.print(" ");
            }
            int c = 1;
            for (int k=1; k<=i; k++) {
                System.out.print(c + " ");
                c = c * (i - k) / k;
            }
            System.out.println();
            //space--;
        }
    }
}


/*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
