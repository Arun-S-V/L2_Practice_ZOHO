package Numerical;

import java.util.Scanner;

public class LargestPossiblePrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numArray[] = new int[n];
        for(int i = 0;i<n;i++){
            numArray[i] = scan.nextInt();
        }
        String s1 = "";
        for(int i =0;i<numArray.length;i++){
            s1 = s1 + numArray[i];
        }
        int num = Integer.parseInt(s1);

    }
}
