package recursion;

import java.util.Scanner;

public class patternrecursion {
    static void recusrivepattern(int n){
        if (n<=0){
            //System.out.println(m);
            return;
        }
       // recusrivepattern(n-m,m);
        System.out.println(n+ " ");
        recusrivepattern(n-5);
    }
    static void printincreasing(int n,int k){
        if (n>k) return;
        System.out.println( n + "");
        printincreasing(n+5,k);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if (n%5==0){
            recusrivepattern(n);
            printincreasing(0,n);
        }else{
            recusrivepattern(n);
            printincreasing(n%5-5,n);
        }


    }
}
