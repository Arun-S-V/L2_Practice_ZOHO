package pattern.number;

public class DiamondPatternNumber {
    public static void main(String[] args) {
        int range = 3;
        int j = 0;
        for(int i =1;i<=range;i++){
            for(j =1;j<=range-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i =range-1;i>=0;i--){
            for(j =1;j<=range-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}


/*
   1
  212
 32123
4321234
 32123
  212
   1
*/