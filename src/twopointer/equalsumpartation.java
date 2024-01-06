package twopointer;

import java.util.Scanner;

public class equalsumpartation {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int totalsum(int[] arr){
        int totalsum=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartation(int[] arr){
        int totalsum=totalsum(arr);
        int prefixsum=0;
        for (int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            int suffixsum=totalsum-prefixsum;
            if (suffixsum==prefixsum){
                return true;
            }
        }
        return false;

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
        System.out.println("equalparation is: " + equalsumpartation(arr));
    }
}
