package ARRAY2.O;

import java.util.Scanner;

public class checksorted {
    static boolean issoretd(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
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
//
        System.out.println(issoretd(arr));
    }
}
