package loopproblem;

import java.util.Scanner;

public class numberofdigit01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of digit this not good method");
        int n= sc.nextInt();
        int numbeofdigit = 0;
        for (int i=0;i<n;i++){
            n=n/10;
            numbeofdigit++;
            //System.out.println(numbeofdigit);
        }
       System.out.println(numbeofdigit);
        System.out.println("this not true method for find number of digit");


    }
}
