package ARRAY2.O;

public class roatateatrray2 {
    static int[] rotatearr(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int[] ans=new int[n];
        for (int i=k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<k-1;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] ans={2,4,6,87,88};
        int arr[] = rotatearr(ans,3);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
