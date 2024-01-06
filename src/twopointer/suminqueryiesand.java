package twopointer;

import java.util.Scanner;

public class suminqueryiesand {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] sumofqueries(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
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
        int[] prefix=sumofqueries(arr);
        System.out.println("enter the queries:");
        int q =sc.nextInt();
        while(q-- > 0){
            System.out.println("enter the range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans = prefix[r] - prefix[l-1];
            System.out.println("sum:"+ ans);


        }

    }
}
