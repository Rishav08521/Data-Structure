package arrayproblem.java;

import java.util.Scanner;

public class pairoftwosum {
    static int pairsum(int[] arr,int x){
        int n=arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter x sum");
        int x=sc.nextInt();
        System.out.println(pairsum(arr,x));

    }
}
