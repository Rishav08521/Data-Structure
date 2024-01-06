package arrayproblem.java;

import java.util.Scanner;

public class sortedbysquare {
    static void printarray2(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
//    static void swaparray(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    static void reversearray(int[] arr){
//        int n=arr.length;
//        int right=n-1,left=0;
//        int i=0,j=n-1;
//        while(i<j){
//            swaparray(arr,i,j);
//            i++;
//            j--;
//        }
    //}
    static int[] sortbysquare(int [] arr){
        int n=arr.length;
        int right=n-1,left=0;
        int k=n-1;
        int[] ans=new int[n];
        while(left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }else {
                ans[k--]=arr[right]*arr[right];
                right--;
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printarray2(arr);
        int[] ans=sortbysquare(arr);
        System.out.println("sorted array");
       // reversearray(ans);
        printarray2(ans);
    }
}

