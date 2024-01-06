package arrayproblem.java;

import java.util.Scanner;

public class prefixsummm03 {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static int[] preficsummm(int[] arr){
        int n=arr.length;
        int [] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+ n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printarray(arr);
        int[] ans =preficsummm(arr);
        printarray(ans);


    }
}
