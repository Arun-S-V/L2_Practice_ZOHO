class RemoveSameCharInBigString{
    static String removeChars(String string1, String string2){
        char []arr1 = string1.toCharArray();
       for(int i =0;i<string2.length();i++){
           for(int j =0;j<string1.length();j++){
               if(arr1[j] == string2.charAt(i)){
                   arr1[j] = 'A';
               }
           }
       }
       //System.out.println(Arrays.toString(arr1));
       string1 = "";
       for(int i =0;i<arr1.length;i++){
           if(arr1[i] != 'A'){
               string1 = string1 + arr1[i];
           }
       }
        return string1;
    }
}