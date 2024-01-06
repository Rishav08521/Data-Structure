package RECURSION22;

public class maxuminarr {
    static void maxnum(int[] arr, int idx){
        int n=arr.length;
        if (idx==n) return;

        System.out.println(arr[idx]);
        maxnum(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,67,8,98,23,90};
        //int idx=0;
        maxnum(arr,3);

    }
}
