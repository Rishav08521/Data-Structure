package ARRAYQUESTION;

public class reverse {
    static int[] reversearr(int[] arr){
        int n=arr.length;
        int[] ans=new int[n] ;
        int j=0;
        for (int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
            //System.out.println(ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 56, 45};
        int[] ans=reversearr(arr);

       // System.out.println(ans);
        for (int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
