package Numerical;

public class BalancedNumber {
        Boolean balancedNumber(String N)
        {
        char arr[] = N.toCharArray();
        int n = arr.length;
        int sumLeft = 0;
        int sumRight = 0;
        for(int i =0;i<=(n/2)-1;i++){
            int num = ((int)arr[i])-48;
            //System.out.println(num);
            sumLeft = sumLeft + num;
        }
        for(int j=(n/2)+1;j<n;j++){
            int num = ((int)arr[j])-48;
            sumRight = sumRight + num;
        }
        if(sumLeft == sumRight){
            return true;
        }
        else{
            return false;
        }
    }
}
