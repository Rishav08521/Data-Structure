package ARRAY2.O;

public class twopointerrevse {
    static void printarray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;

        while(i<j){
            int a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;

            i++;
            j--;
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        reverse(arr);

        printarray(arr);
    }
}
