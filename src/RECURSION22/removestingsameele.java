package RECURSION22;

import java.util.Scanner;

public class removestingsameele {
    static String removereccurence(String s, int inx){
        if (inx==s.length()) return " ";
        String small=removereccurence(s,inx+1);
        char cuurentchar=s.charAt(inx);
        if (cuurentchar!='a'){
            return small+ cuurentchar;

        }else{
            return small;
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removereccurence(s,0));




    }
}
