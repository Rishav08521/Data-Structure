package loopproblem;

import java.util.Scanner;

public class primepyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int count =0;
        for (int i=1;i<=r;i++){
            if (r%i==0 || count ==2){
            }
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            System.out.println();


        }
       // System.out.println();
    }
}
