package ARRAY2.O;

import java.util.Scanner;

public class targetsum2 {
    static void targetsum(int[] arr, int target){
        int n=arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                  ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("target");
        int target=sc.nextInt();
        targetsum(arr,target);
    }
}
