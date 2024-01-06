package arrayproblem.java;

import java.util.Scanner;

public class secondmin {
    static int minimumvalue(int[] arr){
        int min= Integer.MAX_VALUE;
       // int ans=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int secondmin(int[] arr){
        int min=minimumvalue(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondmin=minimumvalue(arr);
        return secondmin;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + "elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondmin(arr));
    }
}
