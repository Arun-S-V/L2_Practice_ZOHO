package pattern.star;

public class RightTrianglePattern {
    public static void main(String[] args) {
        int range = 5;
       for(int i =0;i<range;i++){
           for(int j =0;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
