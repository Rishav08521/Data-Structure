package recursion;

import java.util.Scanner;

public class printallindex {
    static int printallindexes(int[] arr,int n,int target,int index){
        if (index>=n) return -0;
        if (arr[index]==target){
            System.out.println(index);
        }
        return printallindexes(arr,n,target,index+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter ther size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        int index=0;
        System.out.println(printallindexes(arr,n,target,index));

    }
}
