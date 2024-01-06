package arrayproblem.java;

import java.util.Scanner;

public class negativeandpositive {
    static int[] negativepositive(int[] arr){
        int n=arr.length;
        int[] arr2=new int[n];
        int k = 0;

        for (int i=0;i<n;i++){
            if (arr[i]>0){
                arr2[k]=arr[i];
                k++;
            }
        }

        for (int i=0;i<n;i++) {
            if (arr[i] < 0) {
                arr2[k] = arr[i];
                k++;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[] = negativepositive(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
