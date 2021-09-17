package pattern.star;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int range = 10;
        int space = range-1;
        for(int i = 0;i<range;i++){
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
        space = 1;
        for(int i = range-2;i>=0;i--){
            for(int j = 0;j<space;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}
