package arrayproblem.java.minnum0222;

import java.util.Scanner;

public class secondlargestnum {
    static int findmaxvalue(int[] arr){
        int max=Integer.MIN_VALUE;
        int n =arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondmax(int[] arr){
        int max=findmaxvalue(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }

        }
        int secondmax=findmaxvalue(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+ n + " elements" );
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(" second maximum elements "+ secondmax(arr));
    }
}
