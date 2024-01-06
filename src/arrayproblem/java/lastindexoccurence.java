package arrayproblem.java;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class lastindexoccurence {
    static int lastoccurence(int [] arr,int x){
        int lastindexoccurence=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                lastindexoccurence=i;
            }
        }
        return lastindexoccurence;

    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println(lastoccurence(arr,x));

    }
}
