package arrayproblem.java;

public class suffixsuminanotgerbmetdi {
    static void suffixsum(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i+1];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,10};
        suffixsum(arr);
        for(int val:arr){
            System.out.println(val);
        }

    }
}
