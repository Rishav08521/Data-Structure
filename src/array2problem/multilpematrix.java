package array2problem;

public class multilpematrix {
    public static void main(String[] args) {
        int[][]a={{2,3,4},{4,6,8}};
        int [][] b={{2,5,8},{4,7,5}};
        int [][]c=new int[2][3];
        for (int i=0;i<=a.length;i++){
            for (int j=0;j<=b.length;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
