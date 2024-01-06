package loopproblem;

import java.util.Scanner;
public class average0fnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three num");
        int num;
        int num1=sc.nextInt();
        int num2 =sc.nextInt();
        int num3=sc.nextInt();
        num=(num1+num2+num3)/3;
        System.out.println(num);

    }

}
