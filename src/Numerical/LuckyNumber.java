package Numerical;

class LuckyNumber
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    static int count = 2;
    public static boolean isLucky(int n)
    {
        if(count>n){
            return true;
        }
        if(n%count  == 0){
            return false;
        }
        int nextPosition = n-(n/count);
        count++;
        return isLucky(nextPosition);
    }

    public static void main(String[] args) {
        if(isLucky(19)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
//        Math.sqrt();
    }


}
