package arrayproblem.java;

import java.util.Scanner;

public class inputinarrray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " + n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
       // System.out.println("");
        int[] arr2= arr;

    }
}
