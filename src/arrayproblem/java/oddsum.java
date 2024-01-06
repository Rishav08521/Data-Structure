package arrayproblem.java;

import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int odd=0;
        int even=0;
        int sum=0;
        for (int num:arr){
            if (num%2==1){
                int temp=odd;
                odd=even;
                even=temp;
                odd++;
            }
            else{
                even++;
            }
            sum=sum+odd;

        }
        System.out.println(sum);
    }
}
