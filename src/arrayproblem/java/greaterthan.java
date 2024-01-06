package arrayproblem.java;

import java.util.Scanner;

public class greaterthan {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9};
        int num=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>num){
                num=arr[i];
            }
        }
        System.out.println(num);
    }
}
