package arrayproblem.java;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class thirdsmallest {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
       // System.out.println("enter " + n + " elements ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k-1]);

    }
}
