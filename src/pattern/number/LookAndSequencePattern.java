package pattern.number;

public class LookAndSequencePattern {
    public static void main(String[] args) {
        int value = 4;
        lookAndSay(value,"1");
//        String str = new LookAndSequencePattern().countAndSay(4);
//       System.out.println(str);
    }
    public String countAndSay(int n) {
        if (n==1)
            return "1";
        return say(countAndSay(n-1));
    }
    public String say(String str){
        System.out.println(str);
        String result = "";
        for (int i=0;i<str.length();){
            char ch = str.charAt(i);
            int c=1;
            while(++i < str.length() && ch==str.charAt(i)){
                c++;
            }
            result = result+c+ch;
        }
        //System.out.println(result);
        return result;
    }
    public static void lookAndSay(int value,String result){
        for(int k =1;k<value;k++){
            //result = "";
            for (int i=0;i<result.length();){
                char ch = result.charAt(i);
                int c=1;
                while(++i < result.length() && ch==result.charAt(i)){
                    c++;
                }
                String in = "";
                in = in+c+ch;
                result = in;
                System.out.println(in);
            }
        }
       // System.out.println(result);
    }
}

