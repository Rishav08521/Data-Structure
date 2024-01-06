package recursion;

import java.util.Scanner;

public class sum0fdigitnumbyrecutrsive {
    static int sumofdigit(int n){
        if (n >=0 && n<=9){
            return n;
        }
        int lowdigit = sumofdigit(n/10);
        int sumdigit=lowdigit+n%10;
        return sumdigit;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigit(n));

    }
}
