package arrayproblem.java;

import java.util.Scanner;

public class presenquery {
    static int[] makefrequencyarray(int[] arr){
        int[] frequnecy=new int[100005];
        for (int i=0;i<arr.length;i++){
            frequnecy[arr[i]]++;
            //[arr[i]=frequnecy[arr[i]+1;

        }
        return frequnecy;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+ n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int[] frequency= makefrequencyarray(arr);
        System.out.println("enter the queries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter number to be search");
            int x=sc.nextInt();
            if (frequency[x]>0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            q--;

        }


    }
}
