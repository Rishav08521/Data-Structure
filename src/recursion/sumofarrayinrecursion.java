package recursion;

import java.util.Scanner;

public class sumofarrayinrecursion {
    static int summ(int[] arr,int index){
        if (index==arr.length){
            return 0;
        }
        int smallsum=summ(arr,index+1);
        int sumofarray=arr[index]+smallsum;
        return sumofarray;
    }
    public static void main(String[] args) {
        //int[] arr={3,5,7,};
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println(" enter "+ n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index =0;
        System.out.println(summ(arr,index));

    }
}
