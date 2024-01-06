package ARRAY2.O;

public class reversearray {
    static  int[] reversearr(int [] arr){
        int n=arr.length;
        int ans[] =new int[n];
        int j=0;
        for (int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,1,9};

        int[] ans=reversearr(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        }

    }
}
