package recursion;

import java.util.Scanner;

public class maxarrayinrecusrion {
    static int maxarr(int[] arr,int index){
        if (index==arr.length-1){
            return arr[index];
        }
        int smallestarr=maxarr(arr,index+1);
        int maximumarr=Math.max(arr[index],smallestarr);
        return maximumarr;
    }
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int index=0;
//        int n= sc.nextInt();
//        int[] arr=new int[n];
        int[] arr={2,3,5,7,8,9};
        int index =0;
        System.out.println(maxarr(arr,index));

    }
}
