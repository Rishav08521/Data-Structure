package ARRAYQUESTION;

public class reveseintwomehod {
    static void swaparray( int[] arr){
        int n=arr.length;
         int st=0;
         int end=n-1;
         while (st<end) {
             int temp = arr[st];
             arr[st] = arr[end];
             arr[end]= temp;
             st++;
             end--;
         }
    }
    public static void main(String[] args) {
        int[] ans={2,3,4,5,6,7};
        swaparray(ans);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
