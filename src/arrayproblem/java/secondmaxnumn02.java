package arrayproblem.java;

import java.util.Scanner;

public class secondmaxnumn02 {
    static int maxnum(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondmax(int[] arr){
        int max=maxnum(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=maxnum(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enbter " + n +"elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondmax(arr));
    }
}
