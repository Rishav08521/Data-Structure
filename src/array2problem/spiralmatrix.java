package array2problem;

import java.util.Scanner;

public class spiralmatrix {
    static void printarray(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void spiralma(int[][] matrix,int r,int c){
        int toprows=0,botttomrow=r-1,leftcol=0,rightcol=c-1;
        int totalelements=0;
        while(totalelements <r*c ) {
            //toprow=leftcol to rightcol
            for (int j=leftcol;j<=rightcol;j++){
                System.out.println(matrix[toprows][j]+" ");
            }
            toprows++;
            //rightcol=toprow to bottomrow
            for (int i=toprows;i<=botttomrow;i++){
                System.out.println(matrix[i][rightcol]+ " ");
            }
            rightcol--;
            //bootomrow=rightcol to leftcol
            for (int j=rightcol;j<=leftcol;j--){
                System.out.println(matrix[botttomrow][j]+ " ");
            }
            botttomrow--;
            //leftcol=bottomrow to toprow
            for (int i=leftcol;i<=botttomrow;i++){
                System.out.println(matrix[i][leftcol]);
            }
            leftcol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalmatrix=r*c;
        System.out.println("enter "+totalmatrix+ " elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("entr the input matrix");
        printarray(matrix);
    }
}
