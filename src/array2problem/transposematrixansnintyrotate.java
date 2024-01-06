package array2problem;

import java.util.Scanner;

public class transposematrixansnintyrotate {
    static void printarray(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void transposematrix(int[][] matrix,int r,int c){
        int[][] ans=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reversearray(int[] arr){
       int i=0,j=arr.length-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
    }
    static void rotatematrix(int[][] matrix,int n){
        transposematrix(matrix,n,n);
        for (int i=0;i<n;i++){
            reversearray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int[][]matrix=new int[r][c];
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        int totalelements=r*c;
        System.out.println("enter " + totalelements+ " elemts");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printarray(matrix);
        rotatematrix(matrix,r);
        System.out.println("rotatematrix");
        //rotatematrix(matrix,r,c);
        printarray(matrix);

    }
}
