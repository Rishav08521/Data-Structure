package RECURSION02;

public class printarrreverse {
    static void printsum(int[] arr, int index){
        if (index<0){
            return;
        }
        System.out.print(arr[index]+" ");
        printsum(arr,index-1);
    }
    public static void main(String[] args) {
        int[] arr={2,3 ,45,6,7,8,9};
        printsum(arr,arr.length-1);
    }
}
