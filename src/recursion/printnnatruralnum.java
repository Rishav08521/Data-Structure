package recursion;

import java.util.Scanner;

public class printnnatruralnum {
    static void naturalnum(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        naturalnum(n-1);
        //System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        naturalnum(n);

    }
}
