package ARRAY2.O;

import java.util.Scanner;

public class tripletsum {
    static void tripletsumm(int[] arr, int target){
        int n=arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
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
        System.out.println("target");
        int target=sc.nextInt();
        tripletsumm(arr,target);
    }
}
