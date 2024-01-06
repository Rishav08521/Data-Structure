package RECURSION22;

public class sumofarray {
    static int sumarr(int[] arr, int idx){
        if (idx==arr.length-1) return arr[idx];
        int smallans=sumarr(arr,idx+1);
        return smallans + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8};
        System.out.println(sumarr(arr,0));

    }
}
