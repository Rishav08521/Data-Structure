package arrayproblem.java;

import java.util.Scanner;

public class zerostoonesoretd {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void zerotoone(int[] arr){
        int n=arr.length;
        int zeroes=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
        for (int i=0;i<n;i++){
            if (i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the arrays");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+ " elemenyts");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("originalarray");
        printarray(arr);
        zerotoone(arr);
        System.out.println("sortedarray");
        printarray(arr);

    }
}
