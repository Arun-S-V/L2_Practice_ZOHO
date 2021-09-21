package Numerical;

public class FromASquareCheck {
    static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        if(x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4)
            return "No";
        if(Math.abs(x1 - x3) == Math.abs(x2 - x4) && Math.abs(y1 - y3) == Math.abs(y2 - y4))
            return "Yes";
        return "No";
    }
}
