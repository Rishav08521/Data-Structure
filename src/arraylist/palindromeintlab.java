package arraylist;

import java.util.Scanner;

public class palindromeintlab {
    static String reverse(String s){
        String x="";
        int n=s.length()-1;
        while(n>=0){
            char ch=s.charAt(n);
            x+=ch+"";
            n--;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the String");
        String s=sc.nextLine();
        String x=reverse(s);
        if(s.equals(x)){
            System.out.println("given String is a pallindrome");

        }else{
            System.out.println("given String is not pallindrome");
        }
    }
}
