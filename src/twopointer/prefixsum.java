package twopointer;

public class prefixsum {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefixsum(int[] arr){
        int n= arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int [] ans=prefixsum(arr);
        printarr(ans);

    }
}
