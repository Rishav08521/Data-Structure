package arrayproblem.java;

import java.util.Scanner;

public class oddnumberdetermination {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // int n=sc.nextInt();
       // int[] arr=new int[n];
        int[] arr={2,4,6,8,9,19,8,45,67,89};
        for (int val:arr){
            if (val%2==1){
                System.out.println(val);
            }
        }
    }
}
