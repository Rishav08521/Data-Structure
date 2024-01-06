package ARRAY2.O;

public class reversearrayinanothermethod {
    static void reverse(int[] arr){
        int n =arr.length;
        int arr1[]=new int[n];
        int j=0;
        for (int i=n-1;i>=0;i--){
            arr1[j++]=arr[i];
        }
        System.out.println(arr1);
    }
    public static void main(String[] args) {
        int [] arr={2,4,6,87};
        reverse(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }
}
