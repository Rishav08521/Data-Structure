package ARRAY2.O;

import java.util.Arrays;
import java.util.Scanner;

public class kthelementssmallestlargest {
    static int[] kthsmallestlarg(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
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
        int[] ans=kthsmallestlarg(arr);
        System.out.println("smallest:"+ans[0]);
        System.out.println("largest:"+ans[1]);
    }
}
