package arrayproblem.java;

public class pairsumin222 {
    public static void main(String[] args) {
        int[] arr={3,4,6,7,1};
        int target=7;
        int pairs=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]+arr[j]==target){
                    pairs++;
                }
            }
        }
        System.out.println(pairs);

    }
}
