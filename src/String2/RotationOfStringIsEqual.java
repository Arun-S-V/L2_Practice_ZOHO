package String2;

public class RotationOfStringIsEqual {
    public static boolean isEqualString(String s1,String s2){
        System.out.println((s1+s2).indexOf(s2));
        return(s1.length() == s1.length() && (s1+s2).indexOf(s2) != -1 );
    }
    public static void main(String args[]){
        String str1 = "Hello from here";
        String str2 = "erHello from he";
        String s1 = str1.replace(" ","");
        System.out.println(s1);
        String s2 = str1.replace(" ","");
        System.out.println(s2);
        if(isEqualString(str1,str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
