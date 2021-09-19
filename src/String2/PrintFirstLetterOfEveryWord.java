class PrintFirstLetterOfEveryWord {
    String firstAlphabet(String S) {
        String str = "";
        String arr[] = S.split(" ");
        for(int i =0;i<arr.length;i++){
            char ch = arr[i].charAt(0);
            str = str + ch;
        }
        return str;
    }
};