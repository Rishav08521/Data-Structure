package String;

import java.util.Scanner;

public class stringbuideruppertolowerandviceversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {


            //PHysiCs=phYSIcS
            //P-p
            //check = alphabate small and capital
            boolean flag = true;  //true capital
            char ch=str.charAt(i);//A
            if (ch==' ')continue;
            int asci=(int) ch;//65
            if (asci>=97) flag=false;//small
            if (flag==true){
                asci+=32;//capital
                char dh=(char)asci;
                str.setCharAt(i,dh);//a
            }else{// small
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}
