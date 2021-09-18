class MaximumNumberOfToysYouBuy{
    static int toyCount(int N, int K, int arr[])
    {
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for(int i =0;i<N;i++){
            sum = sum +arr[i];
            if(sum>K){
                break;
            }
            count++;
        }
        return count;
    }
}