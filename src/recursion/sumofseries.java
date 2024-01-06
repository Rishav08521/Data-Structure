package recursion;

import java.util.Scanner;

public class sumofseries {
    static int sumseries(int n){
        if (n==0){
            return n;
        }
        int sum=sumseries(n-1);
        int series=sum+n;
        return series;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumseries(n));
    }
}
