package arrayproblem.java;

import java.util.Scanner;

public class laegestnum {
    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
        int [] arr={2,3,4,5,6,7,81000};
        int largestnum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largestnum){
                largestnum=arr[i];
            }
        }
        System.out.println(largestnum);
    }
}
