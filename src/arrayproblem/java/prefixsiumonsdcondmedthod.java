package arrayproblem.java;

public class prefixsiumonsdcondmedthod {
    static void prefixsum(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9};
        prefixsum(arr);
        for(int val:arr){
            System.out.println(val);
        }


    }
}
