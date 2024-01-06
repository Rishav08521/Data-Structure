package recursion;

import java.util.Scanner;

public class sumofnumbyrecurisn {
    static void printstate(int n){
        if (n == 1){
       System.out.println(1);
        return;
        }
        printstate(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        printstate(n);

    }
}
