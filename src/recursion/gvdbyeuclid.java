package recursion;

import java.util.Scanner;

public class gvdbyeuclid {
    static int gcdeuclid(int x,int y){
        if (y==0){
            return x;
        }
        return gcdeuclid(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcdeuclid(x,y));

    }
}
