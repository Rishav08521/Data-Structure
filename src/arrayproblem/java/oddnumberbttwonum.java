package arrayproblem.java;

import java.util.Scanner;

public class oddnumberbttwonum {
    static boolean funodd(int num){
        if(num%2==0){
            //System.out.println("true");
            return false;
        }else{
           // System.out.println("false");
            return true;
        }
    }
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int n=sc.nextInt();
//        System.out.println("enter "+n+"array");
        int l=2;
               // sc.nextInt();
       // System.out.println("enter the l");
        int r=33;
        //sc.nextInt();
        //System.out.println("enter the r");
        for(int i=l;i<=r;i++){
          if(funodd(i)){
              System.out.println(i);
          }
        }
        return;


    }
}
