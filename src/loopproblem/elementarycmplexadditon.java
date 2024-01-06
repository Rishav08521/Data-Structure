package loopproblem;

import java.util.Scanner;

public class elementarycmplexadditon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1=sc.nextDouble();
        System.out.println("enter the second number:");
        double num2=sc.nextDouble();
        double sum=num1+num2;
        double difference=num1-num2;
        double product=num1*num2;
        double quotient=num1/num2;
        System.out.println("the sum of two numbr is:"+ sum);
        System.out.println("the diference of two number is:" + difference);
        System.out.println("the product of two number is:"+ product);
        System.out.println("the quotient of two number is:"+ quotient);

    }
}
