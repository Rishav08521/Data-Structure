package loopproblem;

import java.util.Scanner;

public class powerexponential {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //int n = sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt();
        int ans=1;
        for (int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println(ans);

    }
}
