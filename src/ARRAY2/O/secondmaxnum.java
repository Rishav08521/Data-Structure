package ARRAY2.O;

import java.util.Scanner;

public class secondmaxnum {
    static int finddmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int findsecondmax(int [] arr){
     int max=finddmax(arr);
     for (int i=0;i<arr.length;i++){
         if (arr[i]==max){
             arr[i]=Integer.MIN_VALUE;
         }
     }
     int secondmax=finddmax(arr);
     return secondmax;
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
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
        System.out.print(finddmax(arr));
        System.out.println();
        System.out.print(findsecondmax(arr));
    }
}
