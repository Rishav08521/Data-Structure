package ARRAY2.O;

import java.util.Scanner;

public class occurebnceofele {
    static void printarr(int[] arr , int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static int occurenceofe(int [] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
       // System.out.println(count);
        return count;
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the " + n + " elements" );
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
        System.out.print("enter the x:");
        int x= sc.nextInt();
       // printarr(arr,n);
        System.out.println(occurenceofe(arr,x));

    }
}
