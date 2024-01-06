package array2problem;

import java.util.Scanner;

public class transposeinsapmethod {
    static void printmatrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void transposematricsewap(int[][] matrix,int r, int c){
        //int[][] ans=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalmatri=r*c;
        System.out.println("enter " +totalmatri+" elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        System.out.println("input matrix");
        printmatrix(matrix);
        System.out.println("transpose of matrix");
        transposematricsewap(matrix,r,c);
        printmatrix(matrix);

    }
}
