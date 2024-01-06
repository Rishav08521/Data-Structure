package oops;

import java.io.FileInputStream;

public class exception2 {
    public static void main(String[] args) {
//        try {
//            FileInputStream f1 = new FileInputStream("d:/abc.txt");
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("hello"); // compile time exception
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello");  // runtime exception

//        String name=null;
//        System.out.println(name.length());
    }
}
