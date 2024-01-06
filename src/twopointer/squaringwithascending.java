package twopointer;

public class squaringwithascending {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<end){
            int a = arr[st];
            arr[st]=arr[end];
            arr[end]=a;
            st++;
            end--;
        }
    }
    static int[] squarearr(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int j = n-1;
        int[] ans = new int[n];
        while(st<=end){
            if(Math.abs(arr[st])>Math.abs(arr[end])){
                ans[j] = arr[st]*arr[st];
                st++;
            }else{
                ans[j] = arr[end]*arr[end];
                end--;
            }
            j--;
        }
        return ans;
    }
    public static void main(String[] args) {
     int [] arr={-10,-3,-2,1,4,5};
    // reverse(arr);
     int[] ans =squarearr(arr);
     reverse(ans);
     printarr(ans);
    }
}
