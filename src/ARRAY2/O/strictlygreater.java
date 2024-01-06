package ARRAY2.O;

import java.util.Scanner;

public class strictlygreater {
    static int strictgreater(int [] arr, int x){
        int strictly=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=strictly){
                strictly++;
            }
        }
        return strictly;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the x:");
        int x=sc.nextInt();
        System.out.println(strictgreater(arr,x));
    }
}
