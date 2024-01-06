package bubblesortarray;

import java.util.Scanner;

public class bubblesort {
    static void bobblesort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
         int[] arr = {2, 5, 3, 9, 10};
        bobblesort(arr);
        //int n = arr.length;
        for (int i : arr) {
            System.out.println(i);
        }
    }


}
