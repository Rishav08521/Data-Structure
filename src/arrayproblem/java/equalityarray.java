package arrayproblem.java;

import java.util.Scanner;

public class equalityarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        boolean ans=true;
        for (int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
            if (arr2[i] != arr1[i]){
                ans=false;
                break;
            }
        }
        System.out.println(ans);

    }
}
