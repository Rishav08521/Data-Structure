package recursion;

import java.util.Scanner;

public class palindromecheckbyrecursion {
    static boolean isplaindrome(String s,int l,int r){
        if (l>=r) return true;
        return s.charAt(l)==s.charAt(r) && isplaindrome(s,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        int l=0;
        int r=s.length()-1;
        System.out.println(isplaindrome(s,l,r));
    }
}
