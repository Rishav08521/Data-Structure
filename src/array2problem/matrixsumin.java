package array2problem;

import java.util.Scanner;

public class matrixsumin {
    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
      //  int n=sc.nextInt();
        int[][] a={{2,4,5},{3,5,7},{8,9,6}};
        int[][]b={{2,1,3},{2,5,1},{2,8,4}};
        int [][] c=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                 c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
