package RECURSION02;

public class printarray {
    static void helper(int arr[], int idx){
        if (idx>=arr.length) {
            return;
        }
        System.out.print(arr[idx]+" ");
        helper(arr,idx+1);


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        helper(arr,0);

    }
}
