package recursion;

import java.util.Scanner;

public class powerint01 {
    static int power(int p,int q){
        if (q==0){
            return 1;
        }
        int smallpow=power(p,q-1);
        int powermultiple=p*smallpow;
        return powermultiple;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n,n));

    }
}
