package arrayproblem.java;

import java.util.Arrays;
import java.util.Scanner;

public class sortedarray02 {

    static boolean sortedarray(int[] arr){
        boolean check =true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
    static int[] smallestsandlargest(int[] arr){
        Arrays.sort(arr);
        int ans[]= {arr[0] ,arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println(" enter "+n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println();
        System.out.println(" sortedarray "+ sortedarray(arr));
        int[] ans =smallestsandlargest(arr);
        System.out.println("smallest"+ arr[0]);
        System.out.println("largest"+ arr[n-1]);

    }
}
