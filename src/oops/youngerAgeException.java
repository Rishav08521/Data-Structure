package oops;

import java.util.Scanner;

public class youngerAgeException extends RuntimeException {
    //class youngerAgeException extends RuntimeException{
       // youngerAgeException a=new youngerAgeException();
        youngerAgeException (String mesg){
            super(mesg);

        }
    }
    class voting{


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        try {
            if (age < 18) {
                throw new youngerAgeException("you are not eligibile for voting");
            } else {
                System.out.println("you can vote successfully");
            }
        }catch (Exception e){
            //System.out.println();
            e.printStackTrace();
        }
        System.out.println("hello");
    }


    }
