package String;

public class PolindromeSubString {
    public static void main(String args[]){
        String str = "MALAYALAM";
        int count = 0;
        for(int i =0;i<str.length();i++){
            for(int j =i;j<str.length();j++){
                String subStr = str.substring(i,j+1);
                if(isPalindrome(subStr)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String subStr){
        for(int i =0;i<subStr.length()/2;i++) {
            if(subStr.charAt(i) != subStr.charAt(subStr.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
