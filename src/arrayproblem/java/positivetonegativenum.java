package arrayproblem.java;

import java.util.Scanner;

public class positivetonegativenum {
    static int[] positivenegative(int[] arr){
        int s=0;
        int n=arr.length;
        int [] arr2 =new int[n];
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                arr2[s++] =arr[i];

            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]<0){
                arr2[s++]=arr[i];
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        System.out.println("enter the array ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enterb  " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=positivenegative(arr);
        for (int i=0;i<n;i++){

            System.out.println(arr2[i]+" ");
        }

    }
}
