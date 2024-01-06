package arrayproblem.java;

import java.util.Scanner;

public class presentfrequency {
    static int[] freuencypresent(int[] arr){
        int n=arr.length;
        int frequency[]=new int[100005];
        for (int i=0;i<n;i++){
          //  frequency[[arr[i]]++;
        }
        return frequency;


    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
    }
}
