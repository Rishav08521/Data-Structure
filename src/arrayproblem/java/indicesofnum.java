package arrayproblem.java;

import java.util.Scanner;

public class indicesofnum {
    static int indicesnum(int[] arr,int x){
        int n=arr.length;
        int ans =-1;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                ans=i;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" entr "+n +  " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the x");
        int x=sc.nextInt();
        System.out.println(indicesnum(arr,x));
    }
}
