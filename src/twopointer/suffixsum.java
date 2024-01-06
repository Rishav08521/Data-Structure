package twopointer;

public class suffixsum {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    static int[] suffixsum(int[] arr){
        int n=arr.length;
        int[] suffix=new int[n];
        suffix[n-1]=arr[n-1];
         for (int i=n-2;i>=0;i--) {
             suffix[i] =  suffix[i + 1] + arr[i];
             //arr[i]=arr[i]+arr[i+1];
         }
         return suffix;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int[] ans=suffixsum(arr);
        System.out.println(" suffixsum : ");
        printarr(ans);

    }
}
