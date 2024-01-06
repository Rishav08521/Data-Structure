package ARRAY2.O;

public class maxarrayinsecondme {
    public static void main(String[] args) {
        int[] arr={-1,-3,-100};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}
