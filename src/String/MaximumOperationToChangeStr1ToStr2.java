package String;

public class MaximumOperationToChangeStr1ToStr2 {
    public static void main(String args[]) {
        String str = "abc";
        String target = "cba";
        char strArray[] = str.toCharArray();
        char targetArray[] = target.toCharArray();
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i] != targetArray[i]){
                if(i<strArray.length-1 && strArray[i+1] != targetArray[i+1]) {
                    char temp = strArray[i];
                    strArray[i] = strArray[i+1];
                    strArray[i+1] = temp;
                    count++;
                }
                else{
                    count++;
                }
            }
        }
        System.out.println("The Number of Operation is : "+count);
    }
}