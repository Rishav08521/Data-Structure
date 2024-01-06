package arrayproblem.java;

import java.util.Scanner;

public class reversearray {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static int[] reversenum(int[] arr){
        int j=0;
        int n=arr.length;
        int[] ans=new int[n];
        for (int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7};

        int[] ans=reversenum(arr);
        printarray(ans);


    }
}
