package recursion;

import java.util.Scanner;

public class findallindex {
    static void allindex(int[] arr,int n,int target,int index){
        if (index>=n) return;
        if (arr[index]==target){
            System.out.println(index);
        }
        allindex(arr,n,target,index+1);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the arrays of size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" enter" + n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target =sc.nextInt();
        int index=0;
        allindex(arr,n,target,index);


    }
}
