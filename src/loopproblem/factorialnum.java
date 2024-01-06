package loopproblem;

import java.util.Scanner;

public class factorialnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int factorial=1;
        int n= sc.nextInt();
        for (int i=2;i<=n;i++){
            factorial*=i;

        }
        System.out.println(factorial);
    }
}
