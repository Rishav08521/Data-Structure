package ARRAYNEW2024.REVRSEARRAY;

public class JAVA {
    public static void reverse(int[] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;

        while (st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={-2,3,4,5,-6,7,-8};
        reverse(arr);

    }
}
