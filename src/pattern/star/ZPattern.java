package pattern.star;

public class ZPattern {
    public static void main(String[] args) {
        int range = 8;
        int space = range-2;
        for (int i = 0; i < range; i++) {
            System.out.print("*");
        }
        for(int k =0;k<range-2;k++) {
            System.out.println();
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            space--;
        }
        System.out.println();
        for (int i = 0; i < range; i++) {
            System.out.print("*");
        }
    }
}
