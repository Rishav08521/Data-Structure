package arrayproblem.java;

import java.util.Arrays;
import java.util.Scanner;

public class squarearraybyincreasing {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void swaparr(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reversearr(int[] arr){
        int i=0,j=arr.length-1;
        //int n=arr.length;
       // int[]ans=new int[n];
        while(i<j){
            swaparr(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] squarebyincreasing(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int [] ans=new int[n];
        int right=n-1,left=0;
        int k=0;
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                arr[k++]=arr[left]*arr[left];
                left++;
            }else {
                arr[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+" elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the originsl array");
        printarray(arr);
        int[] ans =squarebyincreasing(arr);
        //System.out.println("enter the array");
        reversearr(ans);
        printarray(ans);
    }
}
