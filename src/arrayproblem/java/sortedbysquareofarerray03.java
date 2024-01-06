package arrayproblem.java;

import java.util.Scanner;

public class sortedbysquareofarerray03 {
    static void printarray(int [] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static int[] squaresoreted(int [] arr){
        int n=arr.length;
        int right=n-1,left=0;
        int [] ans =new int[n];
        int k=n-1;
        while(left<=right){
            if (Math.abs(arr[left])> Math.abs(right)){
                ans[k--]=arr[left]*arr[left];
                left++;
            }else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the array of size");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println(" enter "+n +  "elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the array");
        printarray(arr);
        int[] ans = squaresoreted(arr);
        System.out.println("sorted array");
        //int [] ans =squaresoreted();
        printarray(ans);

    }
}
