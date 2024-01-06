package recursion;

import java.util.Scanner;

public class targetnumberrecrusion {
    static boolean search(int[] arr,int n,int target,int index){
        if (index >= n) return false;
        if (arr[index]==target) return true;
        return  (search(arr,n,target,index+1));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={2,3,4,5,6,7};
        int n=sc.nextInt();
        int target=4;
       // int target =sc.nextInt();
        int index=0;
        if (search(arr,n,target,index)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
