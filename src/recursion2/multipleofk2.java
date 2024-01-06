package recursion2;

import java.util.Scanner;

public class multipleofk2 {
    static int multiple(int n,int k){
        if (k==1){
            return n;
        }
        int mul=multiple(n,k-1);
        System.out.println(n*k);
        return mul;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        //System.out.println(multiple(n,k));
       // multiple(n,k);
        multiple(n,k);
    }
}
