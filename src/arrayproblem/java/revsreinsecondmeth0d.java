package arrayproblem.java;

import java.util.Scanner;

public class revsreinsecondmeth0d {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void swaparray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reversearray(int[] arr,int i, int j){
       // int i=0, j=arr.length-1;
        while(i<j){
            swaparray(arr,i,j);
            i++;
            j--;
        }
    }
    static void roataearray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reversearray(arr,0 ,n-k-1);
        reversearray(arr,n-k,n-1);
        reversearray(arr,0,n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter k");
        int k=sc.nextInt();
        System.out.println("original");

        //int[] arr={1,3,5,7,8};
       // reversearray(arr);
        printarray(arr);
       // reversearray();
        roataearray(arr,k);
        System.out.println("rotataion array");
        printarray(arr);

    }
}
