package arrayproblem.java;

import java.util.Scanner;

public class subarraysum {
    static int totalsum(int [] arr){
        int n=arr.length;
        int totalsum=0;
        for (int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean subsumarr(int [] arr){
        int totalsum=totalsum(arr);
        int prefix=0;
      // int  prefix[0]=arr[0];
        for (int i=0;i<arr.length;i++){
            prefix=prefix+arr[i];
           int suffix=totalsum-prefix;
            if (suffix==prefix){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("equal partion "+ subsumarr(arr));
    }
}
