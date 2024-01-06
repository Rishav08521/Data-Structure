package twopointer;

public class prefixsum2 {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefixsum1(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={5,2,0,3,1};
        int [] ans=prefixsum1(arr);
        printarr(ans);


    }
}
