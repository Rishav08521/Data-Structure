package ARRAY2.O;

import java.util.Scanner;

public class inputinarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " + n + " the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        int[] arr2=arr;
        for (int i=0;i<n;i++){
            System.out.print(arr2[i]);
        }

    }
}
