package Numerical;

public class TwistedPrimeNumber {
    static int isTwistedPrime(int N) {
        for(int j =2;j<N;j++){
            if(N % j == 0){
                return 0;
            }
        }
        String s1 = String.valueOf(N);
        String s2 = "";
        for(int i = s1.length()-1;i>=0;i--){
            s2 = s2 + s1.charAt(i);
        }
        int check = Integer.parseInt(s2);
        System.out.println(check);
        for(int i = 2;i<check;i++){
            if(check % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int n = 97;
        int result = isTwistedPrime(n);
        System.out.println(result);

    }
}


class TwistedPrimeNumber1 {
    static int isTwistedPrime(int N) {
        for(int j =2;j<N;j++){
            if(N % j == 0){
                return 0;
            }
        }
        int check = 0;
        while(N != 0){
            int rem = N%10;
            check = check * 10 + rem;
            N = N/10;
        }
        System.out.println(check);
        for(int i = 2;i<check;i++){
            if(check % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int n = 97;
        int result = isTwistedPrime(n);
        System.out.println(result);

    }
}
