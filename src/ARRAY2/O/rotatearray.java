package ARRAY2.O;

import java.util.Scanner;

public class rotatearray {

    static void reverse(int arr[], int st, int end){
        while(st<end){
            int a = arr[st];
            arr[st] = arr[end];
            arr[end] = a;
            st++;
            end--;
        }
    }
    static void rotatearr(int[] arr, int k){
        int n=arr.length;

        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        rotatearr(arr,3);
        printarray(arr);
    }
}
