package pattern.star;

public class LayeredDiamondPattern {
    public static void main(String[] args) {
        int range = 5;
        int space = range-1;
        int space1 = 0;
        for(int i =0;i<range;i++){
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
        space = 1;
        space1 = space1/2;
        space1 = (space1*2)-1;
        for(int i = range-2;i>=0;i--){
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int h =1;h<(space1*2);h++){
                System.out.print(" ");
            }
            if(space1>0) {
                System.out.print("*");
            }
            //System.out.print("*");
            space++;
            space1--;
            System.out.println();
        }
    }
}
