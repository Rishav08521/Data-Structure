package arraylist;

import java.util.Scanner;

public class rootofsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coefficient of x^x,x and constant ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("the gievn equation"+a+"x*x"+b+"x"+c);
        double d=b*b-4*a*c;
        if(d<0) {
            System.out.println("roots are imaginary");
            double k = Math.sqrt(-d);
            System.out.println(" the first root(" + (-b) + "+" + k + "i)/" + 2 * a);
            System.out.println("first root(" + (-b) + "-" + k + "i)/" + 2 * a);
        }else if(d==0){
            System.out.println("both roots are equal");
            double x=(-b*1.0)/(2*a);
        }else{
            double k=Math.sqrt(d);
            double x1=(-b+k)/2*a;
            double x2=(-b-k)/2*a;
            System.out.println("first root is"+x1);
            System.out.println("second root is"+x2);
        }
    }
}
