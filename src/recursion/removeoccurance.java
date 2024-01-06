package recursion;

import java.util.Scanner;

public class removeoccurance {
    static String remove(String s,int index){
        if (index==s.length())return"";
        String small=remove(s,index+1);
        char  currentChar=s.charAt(index);
        if (currentChar!='a'){
            return currentChar+small;
        }else{
           return small;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int index=0;
        System.out.println(remove(s,index));

    }
}
