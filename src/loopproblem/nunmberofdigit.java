package loopproblem;

import java.util.Scanner;

public class nunmberofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of digit");
        int n = sc.nextInt();
        int number = 0;
        while (n > 0) {
            n=n/10;
            number++;
        }
        System.out.println(number);
    }
}
