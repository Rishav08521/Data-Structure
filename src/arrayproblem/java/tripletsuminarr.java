package arrayproblem.java;

import java.util.Scanner;

public class tripletsuminarr {
    static int triplet(int [] arr,int x){
        int n=arr.length;
        int ans =0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        ans++;
                    }
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println(triplet(arr,x));

    }
}
