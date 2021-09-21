package Numerical;

public class PerfectNumber {
    static int isPerfectNumber(Long N) {
        long sum = 0;
        for(int i =0;i<N-1;i++){
            if(N%i == 0){
                sum = sum +i;
            }
        }
        if(sum == N){
            return 1;
        }
        else{
            return 0;
        }
    }
}
