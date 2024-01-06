package arrayproblem.java;

import java.util.Scanner;

public class ocuurencenumber03 {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " +n + " elements");
        for (int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("enter x ");
        int x=sc.nextInt();
        int count=0;
        //int[] arr1=new int[n];
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println(count);

    }
}
