package pattern.star;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        int range = 12;
        int space = (range*2)-2;
        for(int i =0;i<range;i++){
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            space = space-2;
        }
        space = 2;
        for(int i = range-2;i>=0;i--){
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            space = space+2;
        }
    }
}
