package loopproblem;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc=new Scanner(System.in);
        int year =sc.nextInt();
        System.out.println(isleapyear(year));
    }
    public static boolean isleapyear(int y){
        boolean a=(y%4)== 0;
        boolean b=(y%100) != 0;
        boolean c= (y%100 ==0)&& ( y%400)==0;
        return a && (b || c);
    }
}
