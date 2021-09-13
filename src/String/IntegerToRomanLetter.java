package String;

public class IntegerToRomanLetter {
    public static void main(String args[]){
        int num = 11;
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i =0;i< values.length;i++){
            while(num >=values[i]) {
                num = num - values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println(roman);
    }
}