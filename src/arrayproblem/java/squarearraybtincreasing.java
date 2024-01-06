package arrayproblem.java;

import java.util.Arrays;
import java.util.Scanner;

public class squarearraybtincreasing {
    static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] squarearray(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int right=n-1, left=0;
        int[] ans =new int[n];
        int k=0;
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right]))
            {
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;

            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n + "elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printarray(arr);
        int[] ans=squarearray(arr);
        reverse(ans);
        printarray(ans);

    }
}
