package arrayproblem.java;

import java.util.Scanner;

public class subarray {
    static int findtotoalsum(int[] arr){
        int totalsum=0;
        int n=arr.length;
        for (int i=0;i<n;i++) {
            totalsum += arr[i];
        }
        return totalsum;

    }
    static boolean findequalpartiton(int[] arr){
        int totalsum=findtotoalsum(arr);
        int prefix=0;
        for (int i=0;i<arr.length;i++){
            prefix=prefix+ arr[i];
           int suffix= totalsum-prefix;
           if (suffix==prefix){
               return true;
           }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the aray");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+n+" elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("equal sum partation "+ findequalpartiton(arr));
    }
}
