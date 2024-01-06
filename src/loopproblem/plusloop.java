package loopproblem;

import java.util.Scanner;

public class plusloop {
    public static void main(String[] args) {
        Scanner scm =new Scanner(System.in);
        int r= scm.nextInt();
        int c= scm.nextInt();
        for (int i=1;i<r;i++){
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=r;i>=1;i--){
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=r-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=i-1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=r;i++){
//            for (int j=i-1;j<=r-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i=1;i<=r;i++){
            for (int j=i;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        for (int i=1;i<=r;i++){
            for(int j=i;j<=c-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
