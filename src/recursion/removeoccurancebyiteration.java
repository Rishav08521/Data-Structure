package recursion;

import java.util.Scanner;

public class removeoccurancebyiteration {
    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
        String s="abacx";
        String ans="abacx";
       // int ans=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!='a'){
                ans +=s.charAt(i);
                System.out.println();

            }
        }
    }
}
