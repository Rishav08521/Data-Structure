package loopproblem;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for (int i=1;i<=r;i++){
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                char ch = (char)(k+64);
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i=1;i<=r-1;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=(r-1)*2-1;k<0;k--){
                char ch= (char)(k+64);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
