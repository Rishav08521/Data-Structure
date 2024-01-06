package loopproblem;

import java.util.Scanner;

public class armstrongnum {

    static double numberOfDigit(int n){
        double ans=0;
        while(n>0){
            n=n/10;
            ans++;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;

        double digit = numberOfDigit(n);
        int a = n;
        while(n>0){
          double r=n%10;
            sum=sum+Math.pow(r,digit);
            n=n/10;
        }

        if(sum==a) System.out.println("Yes");
        else System.out.println("NO");
    }
}
