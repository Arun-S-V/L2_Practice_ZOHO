class ReplaceVowelsInReverseOrder
{
    String modify (String s)
    {
        char arr[] = s.toCharArray();
        String temp ="";
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ){
                temp = temp + arr[i];
                arr[i] = '#';
            }
        }
        int j = temp.length()-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == '#'){
                arr[i] = temp.charAt(j);
                j--;
            }
        }
        String s1 = "";
        for(int k =0;k<arr.length;k++){
            s1=s1+arr[k];
        }
        return s1;
    }
}