package array2problem;

import java.util.Scanner;

public class array01 {
    static void printarray(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //int[][] arr2={{2,4,5,},{3,5,6,},{5,8,9,}};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row array ");
        int r=sc.nextInt();
        System.out.println("enter the column");
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];
        System.out.println("enter row and column "+ r*c +" elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                 arr1[i][j]=sc.nextInt();
            }
        }
       // printarray(arr2);
        printarray(arr1);

    }
}
