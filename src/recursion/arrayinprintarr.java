package recursion;

public class arrayinprintarr {
    static void printarr(int[] arr, int index){
        if (index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printarr(arr,index+1);
    }
    public static void main(String[] args) {

        int[] arr={5,6,7,8,9};
        int index=0;
        printarr(arr, index);


    }
}
