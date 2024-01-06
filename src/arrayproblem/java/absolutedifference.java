package arrayproblem.java;

import java.util.Scanner;

public class absolutedifference {
    public static void main(String[] args) {
        System.out.println("enter the arrays");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + "elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[j]-arr[i]==num){
                    System.out.println("yes");
                    return;
                }
            }

        }
        System.out.println("no");
    }
}
