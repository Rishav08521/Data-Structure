package arrayproblem.java;

import java.util.Scanner;

public class sumofarray22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("eneter the size of array");
        int n=sc.nextInt();
        //int[] arr={2,3,4,5,6,7};
        int [] arr=new int[n];
        System.out.println(" enter "+ n + " elements ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
