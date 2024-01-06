package arrayproblem.java;

import java.util.Scanner;

public class prefixadder {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println();
    }
    static int[] prefixsum(int[] arr){
        int n=arr.length;
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+n+" elemensts");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println("enter input array");
       // int x=sc.nextInt();
        printarray(arr);
        int[] prefix=prefixsum(arr);
        printarray(prefix);
    }
}
