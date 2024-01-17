package arrayproblem.java;

import java.util.Scanner;

public class reversearray222 {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter "+ n + " elements");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            int j=0;
            System.out.println(i);
            System.out.println(j);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            System.out.println(i);
            System.out.println(j);

        }
        int i=0,j=arr.length-1;
        while(i<j) {

            i++;
            j--;
        }
    }
}
