package recursion;

import java.util.Scanner;

public class removeoccurencebyanothermethod {
    static String removeocc(String s){
        if (s.length() == 0) return " ";
        String small=removeocc(s.substring(1));
        char currentChar=s.charAt(0);
        if (currentChar !='a'){
            return currentChar+small;
        }else{
            return small;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeocc(s));
    }
}
