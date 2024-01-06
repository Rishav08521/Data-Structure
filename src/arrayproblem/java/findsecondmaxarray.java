package arrayproblem.java;

import java.util.Scanner;

public class findsecondmaxarray {
    static int maxnum(int[] arr){
        int maxnum=Integer.MIN_VALUE;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int secondmax(int [] arr){
        int m=maxnum(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==m){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=maxnum(arr);
        return secondmax;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+"elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondmax(arr));

    }
}
