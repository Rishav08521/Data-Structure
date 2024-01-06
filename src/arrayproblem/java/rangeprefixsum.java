package arrayproblem.java;

import java.util.Scanner;

public class rangeprefixsum {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static int[] prefixsu(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter array");
        printarray(arr);
        int[] pref=prefixsu(arr);
       printarray(pref);
        System.out.println("enter query");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans = pref[r]-pref[l-1];
            System.out.println(" ans " + ans );
        }
    }
}
