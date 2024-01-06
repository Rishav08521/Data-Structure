package recursion;

import java.util.Scanner;

public class palindromereversenum {
    static String revpali(String s,int index){
        if (index==s.length()) return " ";
        String smallrev=revpali(s,index+1);
        return smallrev+s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        int index=0;
        String reverse=revpali(s,index);
        if (reverse.equals(s)){
            System.out.printf(" %s  pallindromr",s);
        }else{
            System.out.printf(" %s not palindrome  num",s);
        }


    }
}
