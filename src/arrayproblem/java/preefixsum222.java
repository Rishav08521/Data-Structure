package arrayproblem.java;

public class preefixsum222 {
    static void prefixsum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        prefixsum(arr);
        for(int val:arr){
            System.out.println(val);
        }

    }
}
