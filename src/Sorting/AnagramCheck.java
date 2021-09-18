class AnagramCheck
{    
    public static boolean isAnagram(String a,String b)
    {
        char array1[] = a.toCharArray();
        char array2[] = b.toCharArray();
        int m = array1.length;
        int n = array2.length;
        if(n != m){
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i =0;i<n;i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}