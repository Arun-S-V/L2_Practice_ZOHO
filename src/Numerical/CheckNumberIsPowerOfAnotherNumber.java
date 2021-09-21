package Numerical;

public class CheckNumberIsPowerOfAnotherNumber {
    static Long isPowerOfAnother(long X, long Y){
        if(X == 1){
            return (long)0;
        }
        if(X == 0){
            return (long)0;
        }
        for(int i =0;i<Y;i++){
            double j = Math.pow(X,i);
            long k = (long)j;
            if(Y == k){
                return (long)1;
            }
        }
        return (long)0;
    }

    public static void main(String[] args) {
        long X = 3;
        long Y = 81;
        long result = isPowerOfAnother(X,Y);
        System.out.println(result);
    }
}
