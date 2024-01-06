package arrayproblem.java;

import java.util.Scanner;

public class zerotoonesortedarray {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void swaparray(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void zerotosortedone(int[] arr){
        int n=arr.length;
        int right=n-1,left=0;
        while(left<right){
            if (arr[left]==1 && arr[right]==0){
                swaparray(arr,left,right);
                left++;
                right--;

            }
            if (arr[left]==0){
                left++;
            }if (arr[right]==1){
                right--;
            }
        }
        printarray(arr);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " +n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("originalarray");
        printarray(arr);
        zerotosortedone(arr);
        System.out.println("sorted array");
        printarray(arr);
    }
}
