package arrayproblem.java;

import java.util.Scanner;

public class prefixsuminscanner {
    static void prefixsumm(int[] arr){
        int prefix[]=new int[arr.length];
         prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prefixsumm(arr);
        for(int val:arr){
            System.out.println(val);
        }


    }
}
