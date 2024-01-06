package arrayproblem.java;

import java.util.Scanner;

public class targetnum {
    static int targetnu(int [] arr,int target){
        int x=target;
        for (int i=0;i<arr.length;i++){
            arr[i]=target;

        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" enter "+n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the targetnum");
        int x=sc.nextInt();
        System.out.println(targetnu(arr,x));
        System.out.println("true");
    }
}
