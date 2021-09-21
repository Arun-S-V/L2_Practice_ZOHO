package Numerical;

class SquareRootOfNumber {
    public static void main(String[] args) {
        long num = 100;
        long result = squareRoot(num);
        System.out.println(result);
    }
    public static long squareRoot(long num)
    {
        long t;
        long sqrtroot = num/2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num /t ))/2;
        }
        while((t - sqrtroot)!= 0);
        return sqrtroot;
    }
}
