package ARRAY2.O;

import java.util.Scanner;

public class twondmethodoccrencelastindex {
    static void lastindexoccure(int[] arr, int x){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                lastindex=i;
            }
        }
        System.out.println(lastindex);
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
        System.out.println("enter the x:");
        int x=sc.nextInt();
        lastindexoccure(arr,x);

    }
}
