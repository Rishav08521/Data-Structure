package arrayproblem.java;

import java.util.Scanner;

public class countofoccrence {
//    static void printarray(int[] arr,int x){
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
    static int countoccurence(int[] arr,int x){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " +n + " elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter x");
       // printarray(arr,x);
        int x=sc.nextInt();
        System.out.println("count of x " + countoccurence(arr,x));
    }
}
