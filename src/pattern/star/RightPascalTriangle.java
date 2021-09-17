package pattern.star;

public class RightPascalTriangle {
    public static void main(String[] args) {
        int range = 10;
        for(int i =0;i<range;i++){
           for(int j =0;j<=i;j++){
               System.out.print("* ");
           }
            System.out.println();
        }
        for(int i=range-2;i>=0;i--){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
