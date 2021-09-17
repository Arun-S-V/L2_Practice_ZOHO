package pattern.star;

public class SandGlassPattern {
    public static void main(String[] args) {
        int range = 5;
        int space = 0;
        for(int i=range-1;i>=0;i--){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
        space = range -1;
        for(int i =0;i<range;i++){
            for(int j =0;j<space;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
}
