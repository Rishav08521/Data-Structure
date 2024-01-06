package recursion;

import java.util.Scanner;

public class fibonacchinum22 {
    static int fibnum(int n){
        if (n==0||n==1){
            return n;
        }
        int firstnum=fibnum(n-1);
        int secondnum=fibnum(n-2);
        int facbonqcchi=firstnum+secondnum;
        return facbonqcchi;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibnum(n));


    }
}
