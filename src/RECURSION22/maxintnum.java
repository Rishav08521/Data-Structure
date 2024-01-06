package RECURSION22;

public class maxintnum {
    static int maxnum(int[] arr, int idx){
        if (idx==arr.length-1) return arr[idx];
        int ans=maxnum(arr,idx+1);
        return Math.max(arr[idx],ans);
    }
    public static void main(String[] args) {
        int [] arr={3,2,13,54,7,8,20};
        int ass=maxnum(arr,0);
        System.out.println(ass);

    }
}
