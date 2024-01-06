package arrayproblem.java;

import java.util.Scanner;

public class sortedbyevenodd {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void swaparray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void evenandodd(int[] arr){
        int n=arr.length;
        int right=n-1,left=0;
        while(left<right){
                if (arr[left]% 2==1 && arr[right]%2==0){
                    swaparray(arr,right,left);
                    left++;
                    right--;
                }
                if (arr[left]%2==0){
                    left++;
                }
                if (arr[right]%2==1){
                    right--;
                }
            }
        printarray(arr);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("entre "+n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printarray(arr);
        evenandodd(arr);
        System.out.println("evenandodd");
        printarray(arr);


    }
}
