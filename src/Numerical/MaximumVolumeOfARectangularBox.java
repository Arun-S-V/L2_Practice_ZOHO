package Numerical;

public class MaximumVolumeOfARectangularBox {
    static long getVol(int A, int B) {
        int result = (36*A*B - A*A*A+((int)Math.sqrt((A*A- 24*B)*(A*A- 24*B)*(A*A- 24*B)))) / (12*72);
        return result;
    }
}
