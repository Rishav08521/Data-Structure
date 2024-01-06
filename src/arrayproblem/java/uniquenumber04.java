package arrayproblem.java;

import java.util.Scanner;

public class uniquenumber04 {
    static int uiquenum(int [] arr){
        int n=arr.length;
        int ans =-1;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("enter the array");
        int[] arr=new int[n];
        System.out.println("entyer " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(uiquenum(arr));
    }
}
