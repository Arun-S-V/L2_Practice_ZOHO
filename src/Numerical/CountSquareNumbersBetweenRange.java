package Numerical;

public class CountSquareNumbersBetweenRange {
    static long count(int N)        {
        long count = 0;
        for(int i =1;i<=N;i++){
            double num = Math.sqrt(i);
            if(num % 1 == 0){
                count++;
            }
        }
        return count;
    }
}
