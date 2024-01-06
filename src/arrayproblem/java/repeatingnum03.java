package arrayproblem.java;

import java.util.Scanner;

public class repeatingnum03 {
    static int repeating(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println();
        System.out.println("enter" +n +" elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(repeating(arr));
    }
}
