package recursion;

import java.util.Scanner;

public class reversestring {
    static String reversesyring(String s,int index){
        if (index==s.length()) return " ";
        String small=reversesyring(s,index+1);
          return small+s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int index=0;
        System.out.println(reversesyring(s,index));
    }
}
