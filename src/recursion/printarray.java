package recursion;

import java.util.Scanner;

public class printarray {
    static void index(int[] arr,int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        index(arr,index+1);
    }


    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
       // int n=sc.nextInt();
        int index=0;
        //int[]arr=new int[n];
       int[] arr={2,3,4,5,6,7};
        index(arr,index);

    }
}
