package arrayproblem.java;

import java.util.Scanner;

public class rotatearrayin {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static int[] rotatearray(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int[] ans = new int[n];
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " +n + "elemnets");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k");
        int k=sc.nextInt();
        System.out.println("enter original array");
        printarray(arr);
        int[] ans=rotatearray(arr,k);
        System.out.println("array after rotation");
        printarray(ans);

    }
}
