package pattern.star;

public class LayeredTrianglePattern {
    public static void main(String[] args) {
        int range = 10;
        int space = range - 1;
        int space1 = 0;
        for(int i =0;i<range-1;i++){
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int h =0;h<(space1*2)-1;h++){
                System.out.print(" ");
            }
            if(space1>0) {
                System.out.print("*");
            }
            space1++;
            System.out.println();
            space--;
        }
        for(int p =0;p<range;p++){
            System.out.print("* ");
        }
    }
}
