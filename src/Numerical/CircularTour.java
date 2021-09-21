package Numerical;

public class CircularTour {
    int tour(int petrol[], int distance[])
    {
        int sum = 0;
        int diff = 0;
        int start = 0;
        for(int i =0;i<distance.length;i++){
            sum = sum + petrol[i] - distance[i];
            if(sum < 0){
                start = i+1;
                diff = diff + sum;
                sum = 0;
            }
        }
        if((sum+diff) >= 0){
            return start;
        }
        else{
            return -1;
        }

    }
    public static void main(String args[]){
        int petrol[] = new int[]{4,6,7,4,8};
        int distance[] = new int[]{1,1,1,1,1};
        int result = new CircularTour().tour(petrol,distance);
        System.out.println(result);
    }
}
