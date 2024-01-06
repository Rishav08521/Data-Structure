package arrayproblem.java;

import java.util.Arrays;
import java.util.Scanner;

public class issorted {
    static int[] smallestandlargest(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    static boolean issortedarray(int[] arr){
        boolean check=true;
        for (int i=1;i<arr.length;i++){
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
        System.out.println(" enter " + n + " elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("issoreted " + issortedarray(arr));
        int[] ans=smallestandlargest(arr);
        System.out.println("smallest " + arr[0]);
        System.out.println("laregest " + arr[n-1]);
    }
}
